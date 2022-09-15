package br.com.javatech.model.stocks;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stocks {
    @Id
    private String id;
    private String symbol;
    private String name;
    private Integer price;
}
