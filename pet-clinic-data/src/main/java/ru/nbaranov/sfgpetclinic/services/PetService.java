package ru.nbaranov.sfgpetclinic.services;

import ru.nbaranov.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
