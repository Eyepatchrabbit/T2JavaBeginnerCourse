package t2.gevorderdecursusttwo.les08_databases.movies;

import javax.persistence.*;
import java.util.Scanner;

public class MovieApp {

    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("java-gevorderd");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which id do you want");
        int idnummerToQuerry = scanner.nextInt();
        Movie movieQuerried = typedQuerryFindById(idnummerToQuerry);
        System.out.println("Querried by id: " + movieQuerried);

        movieQuerried = typedQuerryFindByTitle("Lion King");
        System.out.println("Querried by name: " + movieQuerried);

        Movie movie = addMovie("First title", "Description of a movie", 8.2, 145.763);
        System.out.println("added row: " + movie);

        updateMovie(movie.getId(), "Frozen");
        System.out.println("updated Title: " + getMovie(movie.getId()));
        deleteMovie(movie.getId());

        ENTITY_MANAGER_FACTORY.close();
    }

    public static Movie typedQuerryFindById(int idNummer) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

        String querry = "select m FROM Movie m WHERE m.id = :movieID"; //* is for oracle db ->try to make something
        TypedQuery<Movie> moviequerry = em.createQuery(querry, Movie.class);
        moviequerry.setParameter("movieID", idNummer); //=>so no sql injection can be done

        if (moviequerry.getResultList().size() > 0) {
            Movie movie = moviequerry.getSingleResult();
            em.close(); // don't forget this!!! =>clean up after your ass!
            return movie;
        } else {
            em.close(); // don't forget this!!! =>clean up after your ass!
            return null;
        }
    }

    public static Movie typedQuerryFindByTitle(String title) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

        String querry = "select m FROM Movie m WHERE m.title = :titleMovie"; //* is for oracle db ->try to make something
        TypedQuery<Movie> moviequerry = em.createQuery(querry, Movie.class);
        moviequerry.setParameter("titleMovie", title); //=>so no sql injection can be done
        Movie movie = moviequerry.getSingleResult();
        em.close(); // don't forget this!!! =>clean up after your ass!
        return movie;
    }


    public static Movie addMovie(String title, String description, double average, double popularity) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        // Used to issue transactions on the EntityManager
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();

            // Create and set values for new customer
            Movie movie = new Movie();
            movie.setTitle(title);
            movie.setDescription(description);
            movie.setVoteAverage(average);
            movie.setPopularity(popularity);

            // Save the customer object
            em.persist(movie);
            et.commit();
            return movie;
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        } finally {
            em.close();
        }
        return null;
    }

    public static Movie getMovie(int id) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        return em.find(Movie.class, id);
    }

    public static Movie updateMovie(int id, String title) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        Movie movie = em.find(Movie.class, id);

        EntityTransaction et = em.getTransaction();
        try {
            et.begin();

            movie.setTitle(title);

            // Save the customer object
            em.persist(movie);
            et.commit();
            return movie;
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        } finally {
            em.close();
        }
        return null;
    }

    public static void deleteMovie(int id) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        // Used to issue transactions on the EntityManager
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();

            //find movie
            Movie movieToDelete = em.find(Movie.class, id);

            em.remove(movieToDelete);

            et.commit();

        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        } finally {
            em.close();
        }

    }

}
