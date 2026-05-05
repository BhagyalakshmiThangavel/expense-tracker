package com.bhagya.expense_tracker.common;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

    // Minimum 32 characters required for HS256
    private static final String SECRET_KEY =
            "mysecretkeymysecretkeymysecretkey12345";

  
    private static final long EXPIRATION_TIME = 1000 * 60 * 60;

    
	private Key getSignKey() {

		byte[] keyBytes = SECRET_KEY.getBytes();
		return Keys.hmacShaKeyFor(keyBytes);
	}
   
    public String generateToken(String email) {

        return Jwts.builder()
                .subject(email)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(getSignKey())
                .compact();
    }
}