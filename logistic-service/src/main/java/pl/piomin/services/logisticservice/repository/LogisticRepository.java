package pl.piomin.services.logisticservice.repository;

import pl.piomin.services.logisticservice.model.Logistic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogisticRepository extends JpaRepository<Logistic, Long> {
}