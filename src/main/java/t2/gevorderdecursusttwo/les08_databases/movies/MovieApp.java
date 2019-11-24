package t2.gevorderdecursusttwo.les08_databases.movies;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MovieApp {

    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("java-gevorderd");

    public static void main(String[] args) {
        Movie movie = addMovie("First title", "Description of a movie", 8.2, 145.763);
        System.out.println(movie);
        //deleteMovie(2);
        updateMovie(movie.getId(), "Frozen");
        System.out.println(movie);
        System.out.println(getMovie(movie.getId()));
        ENTITY_MANAGER_FACTORY.close();
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
