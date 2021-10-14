package net.arleth.pet.services.map;

import net.arleth.pet.model.Pet;
import net.arleth.pet.services.PetService;

public class PetServiceMap<T extends Pet, ID extends Long> extends AbstractMapService<T, ID> implements PetService<T, ID> {

    @SuppressWarnings("unchecked")
    @Override
    public T save(T object) {
        return super.save((ID) object.getId(), object);
    }

}
