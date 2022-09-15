package br.com.javatech.service.stock;

import br.com.javatech.dao.stocks.StocksRepository;
import br.com.javatech.dao.stocks.mapper.IntegrationToEntity;
import br.com.javatech.model.stocks.Stocks;
import br.com.javatech.service.stock.mapper.IntegrationToService;
import br.com.javatech.service.stock.model.Stock;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ServiceStock {

    private final StocksRepository repository;

    public Optional<Stocks> findByNameContains(String symbol){
        return repository.findById(symbol);
    }
    public List<Stock> findAllStock(){
        return repository.findAll()
                .stream()
                .map(IntegrationToService::EntityToService)
                .collect(Collectors.toList());
    }

    public Stocks create(Stocks stocks){
        return repository.save(stocks);
    }
}
