package com.negosud.api.controller;


import com.negosud.api.model.GestionStocks;
import com.negosud.api.service.GestionStocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:9300/")
public class GestionStocksController {


    @Autowired
    private GestionStocksService gestinStocksService;

    @GetMapping("/gestionStocks")
    public List<GestionStocks> getGestionStocks() {
        return gestinStocksService.getGestionStocks();
    }
}
