package br.com.javatech.controller.stock;

import br.com.javatech.controller.stock.facade.ControllerFacade;
import br.com.javatech.controller.stock.model.StockControllerModel;
import lombok.AllArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RefreshScope
@RestController
@RequestMapping("/stocks")
@AllArgsConstructor
public class StockController {

    private ControllerFacade facade;

    @GetMapping("/trade-info")
    public StockControllerModel findStock(@RequestParam String symbol){
        return facade.findStock(symbol);
    }

    @GetMapping("/list-all")
    public List<StockControllerModel> findStock(){
        return facade.findAll();
    }

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAllById(@RequestParam List<String> id){
        facade.deleteAllById(id);
    }
}
