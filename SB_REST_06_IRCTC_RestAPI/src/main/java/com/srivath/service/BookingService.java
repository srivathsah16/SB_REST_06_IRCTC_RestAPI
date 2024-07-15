package com.srivath.service;

import com.srivath.request.Passenger;
import com.srivath.response.Ticket;

public interface BookingService {
	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicket(Integer ticketNumber);
}
