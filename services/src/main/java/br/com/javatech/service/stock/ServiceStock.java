package br.com.javatech.service.stock;

import br.com.javatech.dao.stocks.StocksRepository;
import br.com.javatech.dao.stocks.mapper.IntegrationToEntity;
import br.com.javatech.dao.stocks.model.StockEntity;
import br.com.javatech.service.stock.mapper.EntityToServiceMap;
import br.com.javatech.service.stock.model.StockServiceModel;
import br.com.javatech.yahoo.YahooFinancesIntegration;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceStock {

    private final StocksRepository repository;
    private final YahooFinancesIntegration integration;

    public Optional<StockEntity> findByIdContains(String symbol){
        return repository.findById(symbol);
    }


    public StockServiceModel findStockIntegration(String symbol){
        return Optional.ofNullable(integration.findStock(symbol))
                .map(IntegrationToEntity::integrationToEntity)
                .map(repository::save)
                .map(EntityToServiceMap::mapFrom)
                .orElseThrow();
    }
    public StockEntity create(StockEntity stock){
        return repository.save(stock);
    }

    public void deleteAllById(List<String> id){
        repository.deleteAllById(id);
    }

    public List<StockServiceModel> findAll() {
        return repository.findAll()
                .stream()
                .map(EntityToServiceMap::mapFrom)
                .toList();
    }
}
