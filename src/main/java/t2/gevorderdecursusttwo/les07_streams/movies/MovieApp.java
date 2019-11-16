package t2.gevorderdecursusttwo.les07_streams.movies;


import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class MovieApp {
    public static void main(String[] args) {
        MovieDatabase database = new MovieDatabase();
        List<Movie> movielist = database.getMovies();

        System.out.println("Having voteAverage over 7");
        List<Movie> over7votes = movielist.stream()
                .filter(movie -> (movie.getVoteAverage() > 7.0))
                .collect(Collectors.toList());
        over7votes.forEach(System.out::println);

        System.out.println("\nBeginning with \"The\":");
        List<Movie> beginningThe = movielist.stream()
                //.filter(movie -> movie.getTitle().substring(0, 3).equals("The")).collect(Collectors.toList());
                .filter(movie -> movie.getTitle().startsWith("The")).collect(Collectors.toList());
        beginningThe.forEach(System.out::println);

        System.out.println("\nDescription to 50 characters:");
        movielist.stream()
                //.forEach(movie -> movie.setDescription(movie.getDescription().substring(0,50).trim()));  //mijn oplossing
                .map(movie -> {
                    if (movie.getDescription().length() > 50) {
                        String trimm = movie.getDescription().substring(0, 50).trim();
                        movie.setDescription(trimm);
                    }
                    return movie;//met de haakjes -> moet zelf zeggen wat de string teruggeeft!
                }).collect(Collectors.toList())
                .forEach(movie -> System.out.println(movie));

        //reading from a file
        System.out.println("\nReading the info from a file");
        try {
            MovieDatabaseReadIn readInDB = new MovieDatabaseReadIn();
            readInDB.getMovies().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
