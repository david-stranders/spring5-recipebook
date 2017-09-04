package nl.davidstranders.spring5recipebook.repositories;

import nl.davidstranders.spring5recipebook.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Dell on 3-9-2017.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
