package com.fxsignal.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FX_LIVE_TRADE")
public class TradeEntity {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	long id;

	@Column(name = "FX_TRADE_NAME")
	String tradeName;

	@Column(name = "FX_TRADE_START")
	String tradeStart;	
	
	@Column(name = "FX_TRADE_END")
	String tradeEnd;	
	
	@Column(name = "FX_TRADE_STOP_LOSS")
	String tradeStopLoss;	
	
	@Column(name = "FX_TRADE_GAIN")
	String tradeGain;	
	
	@Column(name = "FX_TRADE_IS_ACTIVE")
	String isActive;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getTradeStart() {
		return tradeStart;
	}

	public void setTradeStart(String tradeStart) {
		this.tradeStart = tradeStart;
	}

	public String getTradeEnd() {
		return tradeEnd;
	}

	public void setTradeEnd(String tradeEnd) {
		this.tradeEnd = tradeEnd;
	}

	public String getTradeStopLoss() {
		return tradeStopLoss;
	}

	public void setTradeStopLoss(String tradeStopLoss) {
		this.tradeStopLoss = tradeStopLoss;
	}

	public String getTradeGain() {
		return tradeGain;
	}

	public void setTradeGain(String tradeGain) {
		this.tradeGain = tradeGain;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	

}
