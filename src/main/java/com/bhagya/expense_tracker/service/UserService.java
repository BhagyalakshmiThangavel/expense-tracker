package com.bhagya.expense_tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bhagya.expense_tracker.common.JwtUtil;
import com.bhagya.expense_tracker.dto.LoginDto;
import com.bhagya.expense_tracker.dto.NewRegisterDto;
import com.bhagya.expense_tracker.entity.NewRegisterEntity;
import com.bhagya.expense_tracker.repository.NewUserRepository;

@Service
public class UserService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private NewUserRepository repository;
	
	@Autowired
	private JwtUtil jwtUtil;

	public Object registerUser(NewRegisterDto dto) {
		NewRegisterEntity newUser = new NewRegisterEntity();
		newUser.setUserName(dto.getUserName());
		newUser.setPassword(passwordEncoder.encode(dto.getPassword()));
		newUser.setMobileNumber(dto.getMobileNumber());
		newUser.setEmail(dto.getEmail());
		newUser.setConfirmPassword(dto.getConfirmPassword());

		return repository.save(newUser);
	}

	public Object login(LoginDto dto) {

		NewRegisterEntity user = repository.findByEmail(dto.getEmail());
		if (user != null) {
			if (!passwordEncoder.matches(dto.getPassword(), user.getPassword())) {
				return "Invalid Password !!";
			}
		}
		return jwtUtil.generateToken(user.getEmail());
	}
	
	

}
