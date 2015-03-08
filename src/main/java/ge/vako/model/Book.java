package ge.vako.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by vako on 3/7/15.
 */
@Entity
@Table(name = "BOOK")
public class Book implements Serializable {

    @Id
    @GeneratedValue
    private String id;

    private String name;

    @Column(name = "book_description")
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
