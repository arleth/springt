package net.arleth.pet.services;

import net.arleth.pet.model.Owner;

import java.util.Set;

public interface OwnerService<T extends Owner, ID extends Long> extends CrudService<T, ID> {

    T findByLastName(String lastName);
}
