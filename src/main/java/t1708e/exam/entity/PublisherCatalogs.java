package t1708e.exam.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class PublisherCatalogs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String address;
    private String contactPerson;
    private String phoneNumber;

    @OneToMany(mappedBy = "publisherCatalogs", cascade = CascadeType.ALL)
    private Set<BookDetails> bookDetails;

    public PublisherCatalogs(){

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<BookDetails> getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(Set<BookDetails> bookDetails) {
        this.bookDetails = bookDetails;
    }
}
