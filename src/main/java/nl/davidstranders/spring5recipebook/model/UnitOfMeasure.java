package nl.davidstranders.spring5recipebook.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Dell on 3-9-2017.
 */
@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
}
