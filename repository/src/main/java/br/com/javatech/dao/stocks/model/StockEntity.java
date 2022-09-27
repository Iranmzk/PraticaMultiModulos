package br.com.javatech.dao.stocks.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class StockEntity {
    @Id
    private String id;
    private String symbol;
    private String name;
    private Double price;
    private Double closePrice;
    private String percentVariety;
    private String sector;
}
