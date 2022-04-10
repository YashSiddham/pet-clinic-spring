package com.siddhamyash.petclinicspring.controller;

import com.siddhamyash.petclinicspring.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index", "/index/"})
    public String index(){

        return "index";
    }
}
