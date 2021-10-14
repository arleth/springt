package net.arleth.pet.services;

import net.arleth.pet.model.Vet;

import java.util.Set;

public interface VetService<T extends Vet, ID extends Long> extends CrudService<T, ID>{

}
