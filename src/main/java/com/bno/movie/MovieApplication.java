package com.bno.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieApplication {

	public static void main(String[] args) {

		System.setProperty("tsid.tz", "Asia/Seoul");
		System.setProperty("tsid.bit", "5");
		SpringApplication.run(MovieApplication.class, args);
	}

}
