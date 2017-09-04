package nl.davidstranders.spring5recipebook.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Dell on 3-9-2017.
 */
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
