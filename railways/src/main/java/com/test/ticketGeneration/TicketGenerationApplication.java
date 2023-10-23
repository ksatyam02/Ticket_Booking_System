package com.test.ticketGeneration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.test.ticketGeneration.entities.StationLkp;
import com.test.ticketGeneration.repository.StationLkpRepo;

import jakarta.transaction.Transactional;


@SpringBootApplication
public class TicketGenerationApplication {

	@Autowired
	StationLkpRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(TicketGenerationApplication.class, args);
	}

//	@Bean
//	@Transactional
//	void insertData() {
//		List<StationLkp> stations = new ArrayList<>();
//		for (int i = 0; i < 20; i++) {
//			stations.add(StationLkp.builder().stationName(String.valueOf((char) ('A' + i))).firstStation(i == 0)
//					.lastStation(i == 19).price(Long.valueOf((long) (i * 5))).build());
////			d.put(String.valueOf((char)('A'+i)), (i == 0 ? PriceDto.builder().price(Long.valueOf((long) (i*5))).startStation(true).build()
////					: i == 4 ? PriceDto.builder().price(Long.valueOf((long) (i*5))).lastStation(true).build() 
////							: PriceDto.builder().price(Long.valueOf((long) (i*5))).build()));
//
//		}
//		repo.saveAll(stations);
//	}

}
