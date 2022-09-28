package br.com.javatech.controller.stock.facade;

import br.com.javatech.controller.stock.mapper.ServiceToControllerMap;
import br.com.javatech.controller.stock.model.StockControllerModel;
import br.com.javatech.service.stock.facade.ServiceFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;

@Component
@AllArgsConstructor
public class ControllerFacade {

    private ServiceFacade facade;
    public StockControllerModel findStock(String symbol){
        return Stream.of(facade.findStock(symbol))
                .map(ServiceToControllerMap::mapCont)
                .findFirst()
                .orElseThrow();
    }

    public List<StockControllerModel> findAll() {
        return facade.findAll()
                .stream()
                .map(ServiceToControllerMap::mapCont)
                .toList();
    }

    public void deleteAllById(List<String> id){
        facade.deleteAllById(id);
    }
}
