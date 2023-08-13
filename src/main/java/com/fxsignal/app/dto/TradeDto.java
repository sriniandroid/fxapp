package com.fxsignal.app.dto;

public class TradeDto {

	String tradeName;
	String tradeStart;	
	String tradeEnd;	
	String tradeStopLoss;	
	String tradeGain;	
	String isActive;
	
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
