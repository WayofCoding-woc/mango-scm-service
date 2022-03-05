package com.google.scm.mango.api;

import com.google.scm.mango.dto.Mango;
import com.google.scm.mango.service.MangoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
public class MangoAPI {
    @Autowired
    private MangoService mangoService;

    @GetMapping("/view")
    public Mango viewMango(@RequestParam("id") String productId){
        return mangoService.viewMango(productId);
    }

}
