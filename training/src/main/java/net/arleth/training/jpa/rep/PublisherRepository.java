package net.arleth.training.jpa.rep;

import net.arleth.training.jpa.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}