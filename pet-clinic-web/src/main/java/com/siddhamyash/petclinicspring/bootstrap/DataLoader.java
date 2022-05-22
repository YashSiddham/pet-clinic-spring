package com.siddhamyash.petclinicspring.bootstrap;

import com.siddhamyash.petclinicspring.model.Owner;
import com.siddhamyash.petclinicspring.model.Pet;
import com.siddhamyash.petclinicspring.model.PetType;
import com.siddhamyash.petclinicspring.model.Vet;
import com.siddhamyash.petclinicspring.service.OwnerService;
import com.siddhamyash.petclinicspring.service.PetTypeService;
import com.siddhamyash.petclinicspring.service.VetService;
import com.siddhamyash.petclinicspring.service.map.OwnerServiceMap;
import com.siddhamyash.petclinicspring.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
//@Slf4j(topic = "Dataloader Service")
public class DataLoader implements CommandLineRunner {

//    Logger log = LoggerFactory.getLogger(DataLoader.class);

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerServiceMap ownerService, VetServiceMap vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setPetType("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setPetType("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        var owner1 = new Owner();
    //    owner1.setId(1L);
        owner1.setFirstName("Abhijit");
        owner1.setLastName("Vishwakarma");
        owner1.setAddress("B-603, Suyog Apartments, IC Colony");
        owner1.setCity("Mumbai");
        owner1.setTelephone("1212121212");

        Pet abhijitsPet = new Pet();
        abhijitsPet.setPetType(savedDogPetType);
        abhijitsPet.setOwner(owner1);
        abhijitsPet.setBirthDate(LocalDate.now());
        abhijitsPet.setName("Dhanno");
        owner1.getPets().add(abhijitsPet);
        ownerService.save(owner1);

        var owner2 = new Owner();
    //    owner1.setId(2L);
        owner2.setFirstName("Swapnali");
        owner2.setLastName("Vishwakarma");
        owner2.setAddress("B-603, Suyog Apartments, IC Colony");
        owner2.setCity("Mumbai");
        owner2.setTelephone("2121212121");

        Pet swapnalisPet = new Pet();
        swapnalisPet.setPetType(savedCatPetType);
        swapnalisPet.setOwner(owner2);
        swapnalisPet.setBirthDate(LocalDate.now());
        swapnalisPet.setName("Chocolate");
        owner2.getPets().add(swapnalisPet);
        ownerService.save(owner2);

    //    log.info("Loaded Owners....");
        System.out.println("Loaded Owners....");

        var vet1 = new Vet();
    //    vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        var vet2 = new Vet();
    //    vet2.setId(2L);
        vet2.setFirstName("Sam 2");
        vet2.setLastName("Axe 2");

        vetService.save(vet2);

    //    log.info("Loaded Vets....");

    }
}
