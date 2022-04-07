package com.siddhamyash.petclinicspring.bootstrap;

import com.siddhamyash.petclinicspring.model.Owner;
import com.siddhamyash.petclinicspring.model.Vet;
import com.siddhamyash.petclinicspring.service.OwnerService;
import com.siddhamyash.petclinicspring.service.VetService;
import com.siddhamyash.petclinicspring.service.map.OwnerServiceMap;
import com.siddhamyash.petclinicspring.service.map.VetServiceMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
//@Slf4j(topic = "Dataloader Service")
public class DataLoader implements CommandLineRunner {

    Logger log = LoggerFactory.getLogger(DataLoader.class);

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

    var owner1 = new Owner();
    owner1.setId(1L);
    owner1.setFirstName("Michael");
    owner1.setLastName("Weston");

    ownerService.save(owner1);

    var owner2 = new Owner();
    owner1.setId(2L);
    owner1.setFirstName("Michael 2");
    owner1.setLastName("Weston 2");

    ownerService.save(owner2);

    log.info("Loaded Owners....");

    var vet1 = new Vet();
    vet1.setId(1L);
    vet1.setFirstName("Sam");
    vet1.setLastName("Axe");

    vetService.save(vet1);

    var vet2 = new Vet();
    vet2.setId(2L);
    vet2.setFirstName("Sam 2");
    vet2.setLastName("Axe 2");

    vetService.save(vet2);

    log.info("Loaded Vets....");

    }
}
