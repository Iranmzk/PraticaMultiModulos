package br.com.javatech.dao.stocks.mapper;

import br.com.javatech.dao.stocks.model.StockEntity;
import br.com.javatech.yahoo.model.IntegrationResponse;

public class IntegrationToEntity {
    public static StockEntity integrationToEntity(IntegrationResponse response){
        var name = response.getPrice();
        var sector = response.getAssetProfile();
        var value = response.getPrice().getRegularMarketPrice();
        var close = response.getPrice().getRegularMarketPreviousClose();
        var percent = response.getPrice().getRegularMarketChangePercent();
        return StockEntity.builder()
                .symbol(name.getSymbol())
                .name(name.getName())
                .price(value.getRaw())
                .closePrice(close.getRaw())
                .percentVariety(percent.getFmt())
                .sector(sector.getSector())
                .build();
    }
}
