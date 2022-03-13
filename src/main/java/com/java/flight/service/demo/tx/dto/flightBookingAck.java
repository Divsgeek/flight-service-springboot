package com.java.flight.service.demo.tx.dto;

import com.java.flight.service.demo.tx.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class flightBookingAck {
    private String status;
    private double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;


}
