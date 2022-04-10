package com.siddhamyash.petclinicspring.controller;

import com.siddhamyash.petclinicspring.service.VetService;
import com.siddhamyash.petclinicspring.service.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

//    @Autowired
    private final VetService vetService;

    public VetController(VetServiceMap vetServiceMap) {
        this.vetService = vetServiceMap;
    }

    @RequestMapping({"/vets"})
    public String vetList(Model model){

        System.out.println("VETS CONTROLLER CALLED");
        System.out.println(vetService.findAll());
        System.out.println(vetService.findAll().size());
        model.addAttribute("vets", vetService.findAll());


        return "vet/index";
    }
}
