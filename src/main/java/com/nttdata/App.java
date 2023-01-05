package com.nttdata;

import java.sql.Date;
import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.service.ClientServiceI;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
	private final static Logger LOG = LoggerFactory.getLogger(App.class);
	
	@Autowired
	ClientServiceI service;
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }

    
	@Override
	public void run(String... args) throws Exception {
		
		LOG.info("TRAZA INICIO");
		service.addClient("Christian", "Lobon", "96385274Q", Date.valueOf(LocalDate.now()));
		service.addClient("Alba", "Parron", "36925814W", Date.valueOf(LocalDate.now()));
		service.addClient("Santiago", "Lopez", "78945612F", Date.valueOf(LocalDate.now()));
		service.addClient("Rafael", "Blanco", "32165498G", Date.valueOf(LocalDate.now()));
		service.addClient("Juan Manuel", "Gil", "15947823T", Date.valueOf(LocalDate.now()));
		LOG.info("TRAZA FIN");
	}
}
