package com.equity.trading.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.validation.constraints.NotEmpty;

public class TradeStoreDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty
	private String tradeID;
	private String version;
	private String counterPartyId;
	private String bookId;
	private String maturityDate;
	private Timestamp createdDate;
	private String expired;

	public String getTradeID() {
		return tradeID;
	}

	public void setTradeID(String tradeID) {
		this.tradeID = tradeID;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCounterPartyId() {
		return counterPartyId;
	}

	public void setCounterPartyId(String counterPartyId) {
		this.counterPartyId = counterPartyId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getExpired() {
		return expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
	}

	@Override
	public String toString() {
		return "TradeStoreDTO [tradeID=" + tradeID + ", version=" + version + ", counterPartyId=" + counterPartyId
				+ ", bookId=" + bookId + ", maturityDate=" + maturityDate + ", createdDate=" + createdDate
				+ ", expired=" + expired + "]";
	}

}
