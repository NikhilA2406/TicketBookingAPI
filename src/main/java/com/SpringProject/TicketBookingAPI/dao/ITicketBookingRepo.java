package com.SpringProject.TicketBookingAPI.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringProject.TicketBookingAPI.model.Passenger;

@Repository
public interface ITicketBookingRepo extends CrudRepository<Passenger, Integer> 
{
	

}
