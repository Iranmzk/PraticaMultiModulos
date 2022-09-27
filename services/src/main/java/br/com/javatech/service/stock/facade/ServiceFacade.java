package br.com.javatech.service.stock.facade;

import br.com.javatech.service.stock.ServiceStock;
import br.com.javatech.service.stock.mapper.EntityToService;
import br.com.javatech.service.stock.model.StockServiceModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ServiceFacade {

    private ServiceStock serviceStock;

    public StockServiceModel findStock(String symbol){
        return serviceStock.findByIdContains(symbol)
                .map(EntityToService::entityToService)
                .orElseGet(() -> serviceStock.findStockIntegration(symbol));
    }

    public List<StockServiceModel> findAll() {
        return serviceStock.findAll();
    }

    public void deleteAllById(List<String> id) {
        serviceStock.deleteAllById(id);
    }
}
