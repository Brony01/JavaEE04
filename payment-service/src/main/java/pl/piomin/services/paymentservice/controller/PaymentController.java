package pl.piomin.services.paymentservice.controller;

import pl.piomin.services.paymentservice.model.Payment;
import pl.piomin.services.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService service;

    @GetMapping
    public List<Payment> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Payment create(@RequestBody Payment payment) {
        return service.save(payment);
    }
}