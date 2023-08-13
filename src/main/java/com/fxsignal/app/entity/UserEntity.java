package com.fxsignal.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FX_USER")
public class UserEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	long id;

	@Column(name = "FX_USER_NAME")
	String userName;

	@Column(name = "FX_USER_PASSWORD")
	String password;
	
	@Column(name = "FX_USER_EMAIL")
	String email;
	
	@Column(name = "FX_USER_IMEI")
	String imei;
	
	@Column(name = "FX_USER_IS_ACTIVE")
	boolean isActive;
	
	@Column(name = "FX_USER_IS_VERIFIED")
	boolean isVerified;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	
}
