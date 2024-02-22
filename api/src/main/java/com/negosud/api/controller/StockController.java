package com.negosud.api.controller;

import com.negosud.api.model.Stock;
import com.negosud.api.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:9000/")
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/stock")
    public Iterable<Stock> getStocks() {
        return stockService.getStocks();
    }

    @GetMapping("/stock/{id}")
    public Optional<Stock> getStock(@PathVariable Long id) {
        return stockService.getStock(id);
    }

    @DeleteMapping("/stock/{id}")
    public void deleteStock(@PathVariable final Long id) {
        stockService.deleteStock(id);
    }

    @PutMapping("/stock")
    public Stock updateStock(@RequestBody Stock stock)  {
        return stockService.updateStock(stock);
    }
    @PostMapping("/stock")
    public Stock saveStock(@RequestBody Stock stock)  {
        return stockService.saveStock(stock);
    }

}
