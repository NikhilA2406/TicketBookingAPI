package com.SpringProject.TicketBookingAPI.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringProject.TicketBookingAPI.model.Passenger;
import com.SpringProject.TicketBookingAPI.model.Ticket;
import com.SpringProject.TicketBookingAPI.service.ITicketBookingService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/book-ticket")
@Tag(name="TicketBookingAPIs", description="This API is used for get the booking details")
public class TicketBookingController 
{
	@Autowired
	private ITicketBookingService service;
	
	@PostMapping("/getTicketNumber")
	@Operation(summary="POST operation", description="API will accept JSON type of passenger info and will return ticket number")
	public ResponseEntity<Ticket> registerPassenger(@RequestBody Passenger passenger)
	{
		Passenger pass=service.registerPassanger(passenger);
		Ticket ticket =new Ticket();
		ticket.setTicketNumber(pass.getPid());
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	}
	
	@GetMapping("/getTicket/{ticketNumber}")
	@Operation(summary="GET operation", description="API will accept ticket number info and will return ticket booking details")
	public ResponseEntity<Ticket> getFullTicketInfo(@PathVariable("ticketNumber")Integer TicketNumber)
	{
		Passenger passenger=service.fetchPassangerDetails(TicketNumber);
		Ticket ticket =new Ticket();
		ticket.setTicketNumber(TicketNumber);
		ticket.setName(passenger.getName());
		ticket.setDeparture(passenger.getDeparture());
		ticket.setArrival(passenger.getArrival());
		ticket.setDateOfJourney(passenger.getDateOfJourney());
		ticket.setStatus("Confirmed");
		ticket.setTicketCost(4568.3);
	
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	}
	
	

}
