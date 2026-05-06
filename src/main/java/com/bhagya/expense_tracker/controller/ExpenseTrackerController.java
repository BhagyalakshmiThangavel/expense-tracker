package com.bhagya.expense_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bhagya.expense_tracker.dto.LoginDto;
import com.bhagya.expense_tracker.dto.NewRegisterDto;
import com.bhagya.expense_tracker.service.UserService;

@Controller
@RequestMapping("/expense-tracker")
public class ExpenseTrackerController {
	
	
	@Autowired
	UserService userService;
   
	@PostMapping("/signup")
	public ResponseEntity<?> signup(@RequestBody NewRegisterDto dto) {
		return ResponseEntity.ok(userService.registerUser(dto));
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginDto dto){
		return ResponseEntity.ok(userService.login(dto));
		
	}
	
	@GetMapping("/userProfile")
	public ResponseEntity<?> userProfile(){
		return ResponseEntity.ok(userService.getUserProfile());
	}
}
