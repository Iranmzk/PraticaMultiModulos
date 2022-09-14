package br.com.javatechie.model.fiis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Fii {
    private String symbol;
    private String name;
    private Integer price;
}
