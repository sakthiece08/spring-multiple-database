package org.teqmonic.springmultipledatabase.secondary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.teqmonic.springmultipledatabase.secondary.model.Currency;
import org.teqmonic.springmultipledatabase.secondary.repo.CurrencyRepository;

import java.util.List;

@RestController
public class CurrencyController {

    private CurrencyRepository repository;

    public CurrencyController(CurrencyRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/currency")
    public List<Currency> getCurrencies() {
       return repository.findAll();
    }

    @PostMapping("/currency")
    public Currency addCurrency(@RequestBody Currency currency) {
        return repository.save(currency);
    }
}
