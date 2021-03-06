package net.arleth.pet.services;

import net.arleth.pet.model.Owner;

public interface OwnerService<T extends Owner, ID extends Long> extends CrudService<T, ID> {

    T findByLastName(String lastName);
}
