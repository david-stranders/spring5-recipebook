package nl.davidstranders.spring5recipebook.repositories;

import nl.davidstranders.spring5recipebook.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Dell on 3-9-2017.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
