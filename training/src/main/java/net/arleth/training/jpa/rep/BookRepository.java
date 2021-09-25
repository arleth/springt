package net.arleth.training.jpa.rep;

import net.arleth.training.jpa.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
