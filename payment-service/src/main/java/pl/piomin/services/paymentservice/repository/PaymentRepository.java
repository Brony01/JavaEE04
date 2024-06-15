package pl.piomin.services.paymentservice.repository;

import pl.piomin.services.paymentservice.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}