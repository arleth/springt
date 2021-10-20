package net.arleth.pet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serial;
import java.time.LocalDate;

@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    @Serial
    private static final long serialVersionUID = 8839168447350010464L;

    @Column(name = "local_date")
    private LocalDate localDate;

    @Column(name = "description")
    private String description;

    @OneToOne
    private Pet pets;
}
