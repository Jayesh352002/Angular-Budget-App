package com.example.SpringBootProject.demo.Users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserService userService ; 
	
	@GetMapping("/allusers")
	public List<UserEntity> getusers()
	{
		return userService.getUsers();
	}
	
	@PostMapping(path = "/saveusers")
    public String saveUsersData(@RequestBody UserRegisterDTO userRegisterDTO)
    {
        String id = userService.addUsers(userRegisterDTO);
        return id ;
    }
	
	@PostMapping(path = "/loginusers")
    public String loginStudent(@RequestBody UserLoginDTO userLoginDTO)
    {
		String msg = userService.loginUsers(userLoginDTO);
        return msg;
    }
}
