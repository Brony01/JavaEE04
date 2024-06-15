package pl.piomin.services.crmservice.service;

import pl.piomin.services.crmservice.model.Customer;
import pl.piomin.services.crmservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public List<Customer> findAll() {
        return repository.findAll();
    }

    public Customer save(Customer customer) {
        return repository.save(customer);
    }
}