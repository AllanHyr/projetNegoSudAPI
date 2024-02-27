package com.negosud.api.service;

import com.negosud.api.model.GestionStocks;
import com.negosud.api.repository.GestionStocksRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class GestionStocksService {

    @Autowired
    private GestionStocksRepository gestionStocksRepository;

    public List<GestionStocks> getGestionStocks() {
        return gestionStocksRepository.findAll();
    }
}
