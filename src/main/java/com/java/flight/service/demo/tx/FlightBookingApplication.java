package com.java.flight.service.demo.tx;

import com.java.flight.service.demo.tx.dto.flightBookingAck;
import com.java.flight.service.demo.tx.dto.flightBookingRequest;
import com.java.flight.service.demo.tx.service.flightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableTransactionManagement
public class FlightBookingApplication {

	@Autowired
	private flightBookingService service;

	@PostMapping("/bookflightTicket")
	public flightBookingAck bookFlightTicket(@RequestBody flightBookingRequest request) {
		return service.bookFlightTicket(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingApplication.class, args);
	}

}
