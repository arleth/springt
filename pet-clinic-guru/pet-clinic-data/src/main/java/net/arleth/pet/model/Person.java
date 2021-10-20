package net.arleth.pet.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serial;

@MappedSuperclass
public class Person extends BaseEntity {
    @Serial
    private static final long serialVersionUID = -4274238564320485159L;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firsName) {
        this.firstName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
}
