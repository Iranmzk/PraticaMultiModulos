package br.com.javatech.yahoo;

import br.com.javatech.yahoo.model.IntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
public class YahooFinancesIntegration {

    private RestTemplate restTemplateYahoo;

    public IntegrationResponse findStock(String symbol){
        return restTemplateYahoo.getForObject(
                "/stock/v2/get-profile?region=BR&symbol=".concat(symbol), IntegrationResponse.class);
    }

}
