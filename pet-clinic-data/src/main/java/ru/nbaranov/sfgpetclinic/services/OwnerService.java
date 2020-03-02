package ru.nbaranov.sfgpetclinic.services;

import ru.nbaranov.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
