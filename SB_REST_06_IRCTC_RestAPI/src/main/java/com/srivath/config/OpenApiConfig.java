package com.srivath.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(
		title = "IRCTC Application",
		description = "Ticket Booking Application by IRCTC", 
		contact = @Contact(name = "Srivathsa", email = "abc@gmail.com"), 
		version = "v6",
		summary = "BookTicket and GetTicket Operations implemented as operations"),
servers = {
		@Server(description = "dev",url = "http://localhost:8080"),
		@Server(description = "test",url = "http://localhost:8080")
		} 
)
public class OpenApiConfig {

}
