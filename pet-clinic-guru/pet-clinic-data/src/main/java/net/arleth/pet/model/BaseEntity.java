package net.arleth.pet.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private static final long serialVersionUID = -7227986900235030780L;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
