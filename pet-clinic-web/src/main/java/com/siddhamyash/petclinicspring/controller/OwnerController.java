package com.siddhamyash.petclinicspring.controller;

import com.siddhamyash.petclinicspring.service.OwnerService;
import com.siddhamyash.petclinicspring.service.VetService;
import com.siddhamyash.petclinicspring.service.map.VetServiceMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

//    @Autowired
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/list", "index", "index.html"})
    public String vetList(Model model){

        System.out.println("VETS CONTROLLER CALLED");
        System.out.println(ownerService.findAll());
        System.out.println(ownerService.findAll().size());
        model.addAttribute("owners", ownerService.findAll());


        return "owner/index";
    }
}
