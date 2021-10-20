package net.arleth.pet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serial;

@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 3028728295612025577L;

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
