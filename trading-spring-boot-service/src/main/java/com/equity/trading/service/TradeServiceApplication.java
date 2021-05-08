package com.equity.trading.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableCaching
@SpringBootApplication
@ComponentScan({"com.equity.trading"})
public class TradeServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TradeServiceApplication.class, args);
	}

}
