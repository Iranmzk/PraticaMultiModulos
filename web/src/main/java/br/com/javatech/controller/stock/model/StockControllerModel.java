package br.com.javatech.controller.stock.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StockControllerModel {
    private String id;
    private String symbol;
    private String name;
    private Double price;
    private Double closePrice;
    private String percentVariety;
    private String sector;
}
