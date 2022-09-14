package br.com.javatech.service.stock;

import br.com.javatech.dao.stocks.StocksRepository;
import br.com.javatechie.model.stocks.Stocks;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceStock {

    private final StocksRepository repository;

    public List<Stocks> teste(){
        return repository.findAll();
    }
}
