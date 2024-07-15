package com.srivath.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.srivath.request.Passenger;
import com.srivath.response.Ticket;
import com.srivath.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{
	
	//using the Map to store ticket instead of actual Database
	private Map<Integer, Ticket> ticketMap = new HashMap<>();
	private Integer ticketNumber=1;
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		// some IRCTC business logic to book ticket
		
		Ticket ticket = new Ticket();
		BeanUtils.copyProperties(passenger, ticket);
		ticket.setTicketNumber(ticketNumber);
		ticket.setCost(600.0);
		ticket.setStatus("CONFIRMED");
		//saving ticket to the database
		ticketMap.put(ticketNumber, ticket);
		ticketNumber++;
		return ticket;
	}
	@Override
	public Ticket getTicket(Integer ticketNumber) {
		if(ticketMap.containsKey(ticketNumber)) {
			return ticketMap.get(ticketNumber);
		}
		return null;
	}
}

