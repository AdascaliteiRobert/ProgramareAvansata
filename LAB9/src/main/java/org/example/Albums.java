package org.example;



import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * The type Albums.
 */
@Entity
@Table(name="albums")
@NamedQueries({
        @NamedQuery(name = "Albums.findByName",
                query = "SELECT a FROM Albums a WHERE a.title LIKE :title"),
        @NamedQuery(name = "Albums.findById",
                query = "SELECT a FROM Albums a WHERE a.id = :id")
})
public class Albums implements Serializable {
    /**
     * Instantiates a new Albums.
     */
    public Albums() {
    }

    @Id
    @Column(name="id")
    private int id;

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    @Column(name="title")
    private String title;

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="release_year")
    private int release_year;

    /**
     * Gets release year.
     *
     * @return the release year
     */
    public int getRelease_year() {
        return release_year;
    }

    /**
     * Sets release year.
     *
     * @param release_year the release year
     */
    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }



    @Column(name="artist_id")
    private int artist_id;

    /**
     * Gets artist id.
     *
     * @return the artist id
     */
    public int getArtist_id() {
        return artist_id;
    }

    /**
     * Sets artist id.
     *
     * @param artist_id the artist id
     */
    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    @Override
    public String toString() {
        return "Albums{" +
                "id=" + id +
                ", release_year=" + release_year +
                ", title='" + title + '\'' +

                ", artist_id" + artist_id +
                '}';
    }
}