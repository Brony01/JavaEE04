package pl.piomin.services.logisticservice.service;

import pl.piomin.services.logisticservice.model.Logistic;
import pl.piomin.services.logisticservice.repository.LogisticRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogisticService {
    @Autowired
    private LogisticRepository repository;

    @CircuitBreaker(name = "default", fallbackMethod = "fallbackMethod")
    public List<Logistic> findAll() {
        return repository.findAll();
    }

    public Logistic save(Logistic logistic) {
        return repository.save(logistic);
    }

    public List<Logistic> fallbackMethod(Throwable throwable) {
        // 自定义的fallback逻辑
        System.out.println("Fallback method called due to: " + throwable.getMessage());
        return List.of();
    }
}