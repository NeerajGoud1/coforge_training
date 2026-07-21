package com.coforge.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // @Configuration + @EnableAutoConfiguration + @ComponentScan
public class SbPmsApplication { // Entry Point

	public static void main(String[] args) {
		SpringApplication.run(SbPmsApplication.class, args);
	}

}
