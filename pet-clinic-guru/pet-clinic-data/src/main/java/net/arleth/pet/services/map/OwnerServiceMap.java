package net.arleth.pet.services.map;

import net.arleth.pet.model.Owner;
import net.arleth.pet.services.OwnerService;

import java.util.Optional;

public class OwnerServiceMap<T extends Owner, ID extends Long> extends AbstractMapService<T, ID> implements OwnerService<T, ID> {

    @SuppressWarnings("unchecked")
    @Override
    public T save(T object) {
        return super.save((ID) object.getId(), object);
    }

    @Override
    public T findByLastName(String lastName) {
        Optional<T> result = this.map.values().stream().
                filter(t -> t.getLastName().equalsIgnoreCase(lastName)).findFirst();
        return result.orElse(null);
    }
}
