package ru.nbaranov.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import ru.nbaranov.sfgpetclinic.model.Pet;
import ru.nbaranov.sfgpetclinic.services.CrudService;
import ru.nbaranov.sfgpetclinic.services.PetService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
