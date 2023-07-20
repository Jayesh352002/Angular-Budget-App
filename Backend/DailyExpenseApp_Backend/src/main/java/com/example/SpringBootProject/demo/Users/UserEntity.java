package com.example.SpringBootProject.demo.Users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name="users")
public class UserEntity {
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId ; 
	
	@Column(name = "user_name")
	private String userName ; 
	
	@Column(name = "user_email")
	private String email ; 
	
	@Column(name = "user_password")
	private String password ;


	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserEntity(int userId, String userName, String userEmail, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = userEmail;
		this.password = userPassword;
	}

	public UserEntity(String userName, String userEmail, String userPassword) {
		super();
		this.userName = userName;
		this.email = userEmail;
		this.password = userPassword;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return email;
	}

	public void setUserEmail(String userEmail) {
		this.email = userEmail;
	}

	public String getUserPassword() {
		return password;
	}

	public void setUserPassword(String userPassword) {
		this.password = userPassword;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", userEmail=" + email
				+ ", userPassword=" + password + "]";
	} 
	
	
}
