package com.example.SpringBootProject.demo.Users;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<UserEntity , Integer>{

	Optional<UserEntity> findOneByEmailAndPassword(String userEmail, String userPassword);
	UserEntity findByEmail(String email);
}
