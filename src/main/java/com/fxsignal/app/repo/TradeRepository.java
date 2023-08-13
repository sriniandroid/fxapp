package com.fxsignal.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fxsignal.app.entity.TradeEntity;

@Repository
public interface TradeRepository extends JpaRepository<TradeEntity, Long>{

}
