package com.equity.trading.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equity.trading.dto.TradeStoreDTO;
import com.equity.trading.service.TradeStoreService;

@RequestMapping(path = "service/")
@RestController
public class TradeStoreController {
	
	@Autowired
	TradeStoreService tradeStoreService;
	
	@SuppressWarnings("unchecked")
	@PostMapping(value = "/saveTrade", produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TradeStoreDTO>> saveTrade(@RequestBody TradeStoreDTO tradeStoreDTOs) throws Exception{
		List<TradeStoreDTO> trade = null;
		try {
			trade = tradeStoreService.tradeService(tradeStoreDTOs);
		} catch (Exception e) {
			throw new Exception(e);
		}
		return (ResponseEntity<List<TradeStoreDTO>>) trade;
		
	}

}
