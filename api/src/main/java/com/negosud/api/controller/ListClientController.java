package com.negosud.api.controller;

import com.negosud.api.model.ListClients;
import com.negosud.api.service.ListClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:9000/")
public class ListClientController {

    @Autowired
    private ListClientsService listClientService;

    @GetMapping("/listClient")
    public List<ListClients> getListClients()   {
        return listClientService.getListClients();
    }
}
