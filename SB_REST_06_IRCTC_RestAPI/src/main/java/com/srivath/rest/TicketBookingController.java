package com.srivath.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srivath.request.Passenger;
import com.srivath.response.Ticket;
import com.srivath.service.BookingService;

@RestController
public class TicketBookingController {

	@Autowired
	private BookingService bookingService;

	@PostMapping(value = "/ticket", consumes = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger) {
		System.out.println("Passenger = " + passenger);
		Ticket ticket = bookingService.bookTicket(passenger);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
	}

	@GetMapping(value = "/ticket/{ticketNum}", produces = "application/json")
	public Ticket getTicket(@PathVariable("ticketNum") Integer ticketNumber) {
		System.out.println("ticketNumber = " + ticketNumber);
		return bookingService.getTicket(ticketNumber);
	}
}
