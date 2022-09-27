package br.com.javatech.controller.stock.mapper;

import br.com.javatech.controller.stock.model.StockControllerModel;
import br.com.javatech.service.stock.model.StockServiceModel;

public class ServiceToController {
    public static StockControllerModel serviceToController(StockServiceModel model){
        return StockControllerModel.builder()
                .id(model.getId())
                .symbol(model.getSymbol())
                .name(model.getName())
                .price(model.getPrice())
                .closePrice(model.getClosePrice())
                .percentVariety(model.getPercentVariety())
                .sector(model.getSector())
                .build();
    }
}
