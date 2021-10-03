package net.arleth.pet.model;

public class Person extends BaseEntity {
    private static final long serialVersionUID = -4274238564320485159L;

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String firsName;
    private String lastName;
}