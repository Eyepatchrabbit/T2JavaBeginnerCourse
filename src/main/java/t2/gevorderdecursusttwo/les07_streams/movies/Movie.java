package t2.gevorderdecursusttwo.les07_streams.movies;

public class Movie {

    private int id;
    private String title;
    private String description;
    private double popularity;
    private double voteAverage;

    public Movie(int id, String title, String description, double voteAverage, double popularity) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.popularity = popularity;
        this.voteAverage = voteAverage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", popularity=" + popularity +
                ", voteAverage=" + voteAverage +
                '}';
    }
}
