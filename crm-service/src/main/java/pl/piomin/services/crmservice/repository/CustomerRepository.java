package pl.piomin.services.crmservice.repository;

import pl.piomin.services.crmservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}