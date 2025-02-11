package com.SpringProject.TicketBookingAPI.service;

import com.SpringProject.TicketBookingAPI.model.Passenger;

public interface ITicketBookingService 
{
	public Passenger registerPassanger(Passenger passanger);
	public Passenger fetchPassangerDetails(Integer id);

}
