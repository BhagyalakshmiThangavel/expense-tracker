package com.bhagya.expense_tracker.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/** 
 * @author Bhagya
 * This class represents the login entity for the Expense Tracker application.
 */

@Entity
@Table(name = "login_users")
public class LoginEntity {

	private static final String EMAIL = "email";
	private static final String PASSWORD = "password";

	@Column(name = EMAIL)
	private String email;

	@Column(name = PASSWORD)
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginEntity [email=" + email + ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginEntity other = (LoginEntity) obj;
		return Objects.equals(email, other.email) && Objects.equals(password, other.password);
	}

}
