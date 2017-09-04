package nl.davidstranders.spring5recipebook.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Dell on 3-9-2017.
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
