package com.equity.trading.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

import com.equity.trading.dto.TradeStoreDTO;
import com.equity.trading.service.TradeStoreService;

import junit.framework.Assert;

public class TradeStoreControllerTest {

	@InjectMocks
	TradeStoreController tradeStoreController;

	@Mock
	TradeStoreService tradeStoreService;

	@Test
	public void testSaveTrade() throws Exception {
		TradeStoreDTO input = new TradeStoreDTO();
		List<TradeStoreDTO> output = new ArrayList<TradeStoreDTO>();
		input.setTradeID("T1");
		input.setVersion("1");
		input.setCounterPartyId("CP-1");
		input.setBookId("B1");
		input.setMaturityDate("20/05/2020");
		input.setCreatedDate(Timestamp.valueOf(getCurrentDate()));
		output.add(input);
		Mockito.when(tradeStoreService.tradeService(input)).thenReturn(output);
		ResponseEntity<List<TradeStoreDTO>> response = tradeStoreController.saveTrade(input);
		Mockito.verify(tradeStoreService, Mockito.times(1)).tradeService(input);
		Assert.assertNotNull(response);

	}

	public static LocalDateTime getCurrentDate() {
		ZonedDateTime date = ZonedDateTime.now(ZoneId.of(TimeZone.getDefault().getID()));
		return date.toLocalDateTime();

	}
}
