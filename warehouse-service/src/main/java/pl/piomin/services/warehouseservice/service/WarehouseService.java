package pl.piomin.services.warehouseservice.service;

import pl.piomin.services.warehouseservice.model.Warehouse;
import pl.piomin.services.warehouseservice.repository.WarehouseRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {
    @Autowired
    private WarehouseRepository repository;

    @CircuitBreaker(name = "default", fallbackMethod = "fallbackMethod")
    public List<Warehouse> findAll() {
        return repository.findAll();
    }

    public Warehouse save(Warehouse warehouse) {
        return repository.save(warehouse);
    }

    public List<Warehouse> fallbackMethod(Throwable throwable) {
        // 自定义的fallback逻辑
        System.out.println("Fallback method called due to: " + throwable.getMessage());
        return List.of();
    }
}