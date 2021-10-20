package net.arleth.pet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serial;

@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {
    @Serial
    private static final long serialVersionUID = -6941684311949359097L;

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
