package t1708e.exam.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BookDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String author;
    private String genre;
    private String publisher;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publisherId")
    private PublisherCatalogs publisherCatalogs;

    public BookDetails(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public PublisherCatalogs getPublisherCatalogs() {
        return publisherCatalogs;
    }

    public void setPublisherCatalogs(PublisherCatalogs publisherCatalogs) {
        this.publisherCatalogs = publisherCatalogs;
    }
}
