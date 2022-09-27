package br.com.javatech.service.stock.mapper;

import br.com.javatech.dao.stocks.model.StockEntity;
import br.com.javatech.service.stock.model.StockServiceModel;

public class EntityToService {

    public static StockServiceModel entityToService(StockEntity response){
        return StockServiceModel.builder()
                .id(response.getId())
                .symbol(response.getSymbol())
                .name(response.getName())
                .price(response.getPrice())
                .closePrice(response.getClosePrice())
                .percentVariety(response.getPercentVariety())
                .sector(response.getSector())
                .build();
    }
}
