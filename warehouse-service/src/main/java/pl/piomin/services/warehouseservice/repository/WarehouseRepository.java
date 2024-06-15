package pl.piomin.services.warehouseservice.repository;

import pl.piomin.services.warehouseservice.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}