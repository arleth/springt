package net.arleth.training.jpa.bootstrap;

import net.arleth.training.jpa.Author;
import net.arleth.training.jpa.Book;
import net.arleth.training.jpa.Publisher;
import net.arleth.training.jpa.rep.AuthorRepository;
import net.arleth.training.jpa.rep.BookRepository;
import net.arleth.training.jpa.rep.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        Publisher gyldendal = new Publisher("Gyldendal", "staden 1", "Copenhagen", "", "1099");
        publisherRepository.save(gyldendal);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "12340987");
        gyldendal.getBooks().add(ddd);
        ddd.setPublisher(gyldendal);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(gyldendal);

        System.out.println("added author Eric Evans and book");
        Author eske = new Author("Eske", "Willerslev");
        Book dna = new Book("DNA", "9898989898");
        gyldendal.getBooks().add(dna);
        dna.setPublisher(gyldendal);
        eske.getBooks().add(dna);
        dna.getAuthors().add(eske);

        authorRepository.save(eske);
        bookRepository.save(dna);
        publisherRepository.save(gyldendal);

        System.out.println("Added Eske W");
    }
}
