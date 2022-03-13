package com.java.flight.service.demo.tx.repository;

import com.java.flight.service.demo.tx.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {
}
