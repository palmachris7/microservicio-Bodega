package com.idat.microserviciobod.controller;

import com.idat.microserviciobod.model.Bodega;
import com.idat.microserviciobod.service.BodegaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/bodega")
public class BodegaController {
    @Autowired
    private BodegaService service;

    @GetMapping(path= "/listar")
    public @ResponseBody
    List<Bodega> listar(){
        return service.listar();
    }





}
