package net.arleth.pet.services;

import net.arleth.pet.model.Owner;
import net.arleth.pet.model.Pet;

import java.util.Set;

public interface PetService<T extends Pet, ID extends Long> extends CrudService<T, ID>{

}
