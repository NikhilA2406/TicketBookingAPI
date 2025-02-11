package com.SpringProject.TicketBookingAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringProject.TicketBookingAPI.dao.ITicketBookingRepo;
import com.SpringProject.TicketBookingAPI.model.Passenger;

@Service
public class TicketBookingService implements ITicketBookingService {

	@Autowired
	private ITicketBookingRepo repo;
	
	
	@Override
	public Passenger registerPassanger(Passenger passanger) {
		
		return repo.save(passanger);
	}

	@Override
	public Passenger fetchPassangerDetails(Integer id) {
		
		Optional<Passenger> optional=repo.findById(id);
		return optional.get();
	}

}
