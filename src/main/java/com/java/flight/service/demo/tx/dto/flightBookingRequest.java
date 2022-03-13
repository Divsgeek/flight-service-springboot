package com.java.flight.service.demo.tx.dto;

import com.java.flight.service.demo.tx.entity.PassengerInfo;
import com.java.flight.service.demo.tx.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class flightBookingRequest {

    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;

}
