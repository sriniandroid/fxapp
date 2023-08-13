package com.fxsignal.app.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fxsignal.app.dto.TradeDto;
import com.fxsignal.app.entity.TradeEntity;
import com.fxsignal.app.service.TradeService;

@RestController
@RequestMapping(path = "\test")
public class TradeController {
	
	@Autowired
	TradeService tradeService; 
	
	@Autowired
	ModelMapper modelMapper;
	
	@GetMapping
	public List<TradeDto> getAllTrades(){
		List<TradeEntity> trades = tradeService.getAllTrades();
        return trades.stream()
          .map(this::convertToDto)
          .collect(Collectors.toList());
	}
	
	private TradeDto convertToDto(TradeEntity tradeEntity) {
		TradeDto tradeDto = modelMapper.map(tradeEntity, TradeDto.class); 
	    return tradeDto;
	}

}
