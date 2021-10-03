package net.arleth.pet.services;

import net.arleth.pet.model.Owner;
import net.arleth.pet.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
