package pl.piomin.services.logisticservice.controller;

import pl.piomin.services.logisticservice.model.Logistic;
import pl.piomin.services.logisticservice.service.LogisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logistics")
public class LogisticController {
    @Autowired
    private LogisticService service;

    @GetMapping
    public List<Logistic> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Logistic create(@RequestBody Logistic logistic) {
        return service.save(logistic);
    }
}