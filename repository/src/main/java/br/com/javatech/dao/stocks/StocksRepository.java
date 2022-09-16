package br.com.javatech.dao.stocks;

import br.com.javatech.dao.stocks.model.StockEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StocksRepository extends MongoRepository<StockEntity,String> {
    StockEntity findBySymbolContains(String symbol);
}
