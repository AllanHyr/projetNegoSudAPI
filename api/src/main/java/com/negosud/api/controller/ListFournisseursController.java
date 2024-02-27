package com.negosud.api.controller;

import com.negosud.api.model.ListFournisseurs;
import com.negosud.api.service.ListFournisseursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:9000/")
public class ListFournisseursController {

    @Autowired
    private ListFournisseursService listFournisseursService;

    @GetMapping("/listFournisseurs")
    public List<ListFournisseurs> getListFournisseurs() { return listFournisseursService.getListFournisseurs(); }
}
