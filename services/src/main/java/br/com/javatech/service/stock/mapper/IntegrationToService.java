package br.com.javatech.service.stock.mapper;

import br.com.javatech.service.stock.model.StockServiceModel;
import br.com.javatech.yahoo.model.IntegrationResponse;

public class IntegrationToService {

    public static StockServiceModel integrationToService (IntegrationResponse response){
        var name = response.getPrice();
        var sector = response.getAssetProfile();
        var price = response.getPrice().getRegularMarketPrice();
        var closed = response.getPrice().getRegularMarketPreviousClose();
        var percent = response.getPrice().getRegularMarketChangePercent();

        return StockServiceModel.builder()
                .symbol(name.getSymbol())
                .name(name.getName())
                .price(price.getRaw())
                .closePrice(closed.getRaw())
                .percentVariety(percent.getFmt())
                .sector(sector.getSector())
                .build();
    }
}
