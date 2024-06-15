package pl.piomin.services.paymentservice.service;

import pl.piomin.services.paymentservice.model.Payment;
import pl.piomin.services.paymentservice.repository.PaymentRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository repository;

    @CircuitBreaker(name = "default", fallbackMethod = "fallbackMethod")
    public List<Payment> findAll() {
        return repository.findAll();
    }

    public Payment save(Payment payment) {
        return repository.save(payment);
    }

    public List<Payment> fallbackMethod(Throwable throwable) {
        // 自定义的fallback逻辑
        System.out.println("Fallback method called due to: " + throwable.getMessage());
        return List.of();
    }
}