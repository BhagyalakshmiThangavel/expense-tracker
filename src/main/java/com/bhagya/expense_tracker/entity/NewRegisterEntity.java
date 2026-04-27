package com.bhagya.expense_tracker.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/** 
 * @author Bhagya
 * This class represents the New User entity for the Expense Tracker application.
 */

@Entity
@Table(name = "new_register_users")
public class NewRegisterEntity {

	private static final String ID = "id";
	private static final String EMAIL = "email";
	private static final String USERNAME = "user_Name";
	private static final String PASSWORD = "password";
	private static final String CONFIRM_PASSWORD = "confirm_Password";
	private static final String MOBILE_NUMBER = "mobile_Number";

	@Column(name = ID)
	private String id;

	@Column(name = EMAIL)
	private String email;

	@Column(name = USERNAME)
	private String userName;

	@Column(name = PASSWORD)
	private String password;

	@Column(name = CONFIRM_PASSWORD)
	private String confirmPassword;

	@Column(name = MOBILE_NUMBER)
	private String mobileNumber;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "NewRegisterEntity [id=" + id + ", email=" + email + ", userName=" + userName + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", mobileNumber=" + mobileNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, mobileNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewRegisterEntity other = (NewRegisterEntity) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(mobileNumber, other.mobileNumber);
	}
}
