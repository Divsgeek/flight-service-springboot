package com.java.flight.service.demo.tx.repository;

import com.java.flight.service.demo.tx.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
