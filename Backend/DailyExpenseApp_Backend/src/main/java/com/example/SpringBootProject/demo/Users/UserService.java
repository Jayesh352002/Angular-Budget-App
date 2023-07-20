package com.example.SpringBootProject.demo.Users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private UserRepo userRepo ; 
	
	@Autowired
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	public List<UserEntity> getUsers() {
		return userRepo.findAll();
	}

	public String addUsers(UserRegisterDTO userRegisterDTO) {
		
		UserEntity user = new UserEntity(
				userRegisterDTO.getUserName(),
				userRegisterDTO.getUserEmail(),
				userRegisterDTO.getUserPassword());
		
		userRepo.save(user);
		
		return user.getUserName();
	}

	public String loginUsers(UserLoginDTO userLoginDTO) {
		
		UserEntity userEntity = userRepo.findByEmail(userLoginDTO.getUserEmail());
		
		if(userEntity!=null) {
			
			String pass1 = userLoginDTO.getUserPassword();
			String pass2 = userEntity.getUserPassword();
			
			if(pass1.equals(pass2)) {
				
				Optional<UserEntity> user1 = userRepo.findOneByEmailAndPassword(userLoginDTO.getUserEmail(), pass2);
				
				if(user1.isPresent()) {
					return "Login Success";
				}
				else {
					return "Login Failed";
				}
			}
			else {
				return "Password Does Not Match";
			}
		}
		else {
			return "Email Does Not Exists";
		}
	}

}
