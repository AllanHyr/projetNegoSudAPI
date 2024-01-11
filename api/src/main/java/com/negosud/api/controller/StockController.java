package com.negosud.api.controller;

import com.negosud.api.model.Stock;
import com.negosud.api.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/stock")
    public Iterable<Stock> getStocks() {
        return stockService.getStocks();
    }

    @GetMapping("/stock/{id}")
    public Optional<Stock> getStock(Long id) {
        return stockService.getStock(id);
    }

    @DeleteMapping("/stock/{id}")
    public void deleteStock(final Long id) {
        stockService.deleteStock(id);
    }

    @PutMapping("/stock")
    public Stock saveStock(Stock stock)  {
        return stockService.saveStock(stock);
    }
}
