package com.SpringProject.TicketBookingAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="Ticket Booking API",
				version="1.0",
				description="This API is Book Ticket"
				),
		servers=@Server(
				url="http://localhost:8485/TicketBookingAPI",
				description="This is the server where our app is deployed"
				)
		)

public class TouristManagementAppApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(TouristManagementAppApplication.class, args);
		//http://localhost:8485/TicketBookingAPI/swagger-ui/index.html
	}

}
