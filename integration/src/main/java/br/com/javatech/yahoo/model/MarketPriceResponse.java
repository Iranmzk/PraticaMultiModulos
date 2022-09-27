package br.com.javatech.yahoo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarketPriceResponse {
    private PreMarketPriceResponse regularMarketPrice;
    private PreMarketPriceResponse regularMarketPreviousClose;
    private RegularMarketChangePercent regularMarketChangePercent;
    private String symbol;
    @JsonProperty("longName")
    private String name;
}
