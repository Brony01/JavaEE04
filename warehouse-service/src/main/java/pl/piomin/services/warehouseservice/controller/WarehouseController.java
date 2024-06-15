package pl.piomin.services.warehouseservice.controller;

import pl.piomin.services.warehouseservice.model.Warehouse;
import pl.piomin.services.warehouseservice.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warehouses")
public class WarehouseController {
    @Autowired
    private WarehouseService service;

    @GetMapping
    public List<Warehouse> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Warehouse create(@RequestBody Warehouse warehouse) {
        return service.save(warehouse);
    }
}