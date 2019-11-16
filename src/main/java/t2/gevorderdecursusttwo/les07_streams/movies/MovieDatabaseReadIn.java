package t2.gevorderdecursusttwo.les07_streams.movies;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class MovieDatabaseReadIn {
    private List<Movie> movies;

    public MovieDatabaseReadIn() throws IOException {
        //TODO: try and make it more general!->otherwise need to adapt on each computer!
        Path path = Paths.get("/Users/alexanderboffin/Documents/developmentPersonal/sources/JavaBeginnercoursT2/src/main/java/t2/gevorderdecursusttwo/les07_streams/movies/movies.csv");

        movies = Files.lines(path).map(line -> {
                    String[] readLineElements = line.split(";");

                    return new Movie(Integer.parseInt(readLineElements[1]),
                            readLineElements[2],
                            readLineElements[4],
                            Double.parseDouble(readLineElements[3]),
                            Double.parseDouble(readLineElements[0]));
                }
        ).collect(Collectors.toList());

    }

    public List<Movie> getMovies() {
        return movies;
    }
}
