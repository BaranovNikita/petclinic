package ru.nbaranov.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import ru.nbaranov.sfgpetclinic.model.Owner;
import ru.nbaranov.sfgpetclinic.services.OwnerService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return this.map
                .values()
                .stream()
                .filter(o -> o.getLastName().equalsIgnoreCase(lastName))
                .findAny()
                .orElse(null);
    }
}
