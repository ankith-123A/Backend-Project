package com.ankith.backendProject;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SortingServer {

	public static void main(String[] args) 
	{
		SpringApplication.run(SortingServer.class, args);
	}

}