package com.negosud.api.service;

import com.negosud.api.model.Stock;
import com.negosud.api.repository.StockRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public Optional<Stock> getStock(final Long id) {
        return stockRepository.findById(id);
    }

    public Iterable<Stock> getStocks() {
        return stockRepository.findAll();
    }

    public void deleteStock(final Long id) {
        stockRepository.deleteById(id);
    }

    public Stock saveStock(Stock stock) {
        Stock savedStock = stockRepository.save(stock);
        return savedStock;
    }
}
