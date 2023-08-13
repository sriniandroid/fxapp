package com.fxsignal.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fxsignal.app.entity.TradeEntity;
import com.fxsignal.app.repo.TradeRepository;

@Service
public class TradeService {

	@Autowired
	TradeRepository tradeRepository;
	
	public List<TradeEntity> getAllTrades(){
		return tradeRepository.findAll();
	}
	
}
