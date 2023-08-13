package com.fxsignal.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fxsignal.app.entity.UserEntity;
import com.fxsignal.app.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository; 
	
	public List<UserEntity> getAllUsers(){
		return userRepository.findAll();
	}
	
}
