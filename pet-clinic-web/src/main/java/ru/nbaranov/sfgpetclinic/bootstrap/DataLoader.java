package ru.nbaranov.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.nbaranov.sfgpetclinic.model.Owner;
import ru.nbaranov.sfgpetclinic.model.Vet;
import ru.nbaranov.sfgpetclinic.services.OwnerService;
import ru.nbaranov.sfgpetclinic.services.VetService;
import ru.nbaranov.sfgpetclinic.services.map.OwnerServiceMap;
import ru.nbaranov.sfgpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Test");
        owner1.setLastName("Testov");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Owner");
        owner2.setLastName("Ownerov");

        ownerService.save(owner2);

        System.out.println("Owners loaded...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Igor");
        vet1.setLastName("Nikolaev");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Valery");
        vet2.setLastName("Leont'ev");

        vetService.save(vet2);

        System.out.println("Vets loaded... ");
    }
}
