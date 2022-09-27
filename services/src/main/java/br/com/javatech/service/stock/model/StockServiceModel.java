package br.com.javatech.service.stock.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockServiceModel {
    private String id;
    private String symbol;
    private String name;
    private Double price;
    private Double closePrice;
    private String percentVariety;
    private String sector;
}
