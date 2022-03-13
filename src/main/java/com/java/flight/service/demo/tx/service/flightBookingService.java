package com.java.flight.service.demo.tx.service;

import com.java.flight.service.demo.tx.dto.flightBookingAck;
import com.java.flight.service.demo.tx.dto.flightBookingRequest;
import com.java.flight.service.demo.tx.repository.PassengerInfoRepository;
import com.java.flight.service.demo.tx.repository.PaymentInfoRepository;
import com.java.flight.service.demo.tx.entity.PassengerInfo;
import com.java.flight.service.demo.tx.entity.PaymentInfo;
import com.java.flight.service.demo.tx.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class flightBookingService {

    @Autowired
    PassengerInfoRepository passengerInfoRepository;
    @Autowired
    PaymentInfoRepository paymentInfoRepository;

    @Transactional
    public flightBookingAck bookFlightTicket(flightBookingRequest request){

        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();
        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getPId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new flightBookingAck("SUCCESS",passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0],passengerInfo);

    }
}