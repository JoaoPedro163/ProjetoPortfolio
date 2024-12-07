package com.portfolio.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {
    
    @GetMapping("/index")
    public String abrirIndex(){
        return "index";
    }
}
