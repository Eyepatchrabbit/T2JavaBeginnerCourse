package t2.gevorderdecursusttwo.les08_databases.movies;

import javax.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "average", nullable = false)
    private double voteAverage;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "popularity", nullable = false)
    private double popularity;

    public double getPopularity() {
        return popularity;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", voteAverage=" + voteAverage +
                ", description='" + description + '\'' +
                ", popularity=" + popularity +
                '}';
    }
}
