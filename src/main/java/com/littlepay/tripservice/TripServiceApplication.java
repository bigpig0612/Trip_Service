package com.littlepay.tripservice;

import com.littlepay.tripservice.model.Trip;
import com.littlepay.tripservice.processor.TripProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class TripServiceApplication implements CommandLineRunner {

	private final TripProcessor tripProcessor;

	public static void main(String[] args) {
		SpringApplication.run(TripServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Trip> tripList = tripProcessor.createTripList();
		tripProcessor.saveTripList(tripList);
	}

}
