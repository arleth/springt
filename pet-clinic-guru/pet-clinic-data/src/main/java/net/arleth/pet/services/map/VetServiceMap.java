package net.arleth.pet.services.map;

import net.arleth.pet.model.Vet;
import net.arleth.pet.services.VetService;

public class VetServiceMap<T extends Vet, ID extends Long> extends AbstractMapService<T, ID> implements VetService<T, ID> {

    @SuppressWarnings("unchecked")
    @Override
    public T save(T object) {
        return super.save((ID) object.getId(), object);
    }

}
