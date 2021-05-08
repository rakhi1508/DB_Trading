package com.equity.trading.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import com.equity.trading.dto.TradeStoreDTO;

public class TradeStoreService {
	
	public List<TradeStoreDTO> tradeService(TradeStoreDTO tradeStoreDTOs){
		List<TradeStoreDTO> tradeList = new ArrayList<TradeStoreDTO>();
		for (TradeStoreDTO tradeDTO : tradeList) {
			tradeDTO.setTradeID(tradeDTO.getTradeID() );
			tradeDTO.setVersion(tradeDTO.getVersion());
			tradeDTO.setCounterPartyId(tradeDTO.getCounterPartyId());
			tradeDTO.setBookId(tradeDTO.getBookId());
			tradeDTO.setMaturityDate(tradeDTO.getMaturityDate());
			tradeDTO.setCreatedDate(Timestamp.valueOf(getCurrentDate()));
			tradeList.add(tradeDTO);
		}
		return tradeList;
	}

	public static LocalDateTime getCurrentDate(){
		ZonedDateTime date = ZonedDateTime.now(ZoneId.of(TimeZone.getDefault().getID()));
		return date.toLocalDateTime();
		
	}
}
