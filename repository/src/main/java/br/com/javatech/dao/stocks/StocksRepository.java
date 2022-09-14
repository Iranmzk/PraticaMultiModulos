package br.com.javatech.dao.stocks;

import br.com.javatechie.model.stocks.Stocks;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StocksRepository extends MongoRepository<Stocks,String> {
}
