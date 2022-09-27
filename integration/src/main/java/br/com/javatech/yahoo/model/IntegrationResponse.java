package br.com.javatech.yahoo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IntegrationResponse {
    private MarketPriceResponse price;
    private AssetProfile assetProfile;
}
