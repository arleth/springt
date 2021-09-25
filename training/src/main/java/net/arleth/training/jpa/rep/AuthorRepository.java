package net.arleth.training.jpa.rep;

import net.arleth.training.jpa.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
