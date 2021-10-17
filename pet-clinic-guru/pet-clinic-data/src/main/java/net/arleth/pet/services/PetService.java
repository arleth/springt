package net.arleth.pet.services;

import net.arleth.pet.model.Pet;

public interface PetService<T extends Pet, ID extends Long> extends CrudService<T, ID>{

}
