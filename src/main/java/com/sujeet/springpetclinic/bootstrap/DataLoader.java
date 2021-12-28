package com.sujeet.springpetclinic.bootstrap;

import com.sujeet.springpetclinic.model.Owner;
import com.sujeet.springpetclinic.model.Vet;
import com.sujeet.springpetclinic.service.OwnerService;
import com.sujeet.springpetclinic.service.VetService;
import com.sujeet.springpetclinic.service.map.OwnerServiceMap;
import com.sujeet.springpetclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Sujeet");
        owner1.setLastName("Kumar");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Sujeet");
        owner2.setLastName("Singh");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Harshvardhan");
        vet1.setLastName("Joshi");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Hariom");
        vet2.setLastName("Chaurasia");

        vetService.save(vet2);

    }
}
