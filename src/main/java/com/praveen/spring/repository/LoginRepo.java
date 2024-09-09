package com.praveen.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.praveen.spring.model.LogIn;


@Repository
public interface LoginRepo extends JpaRepository<LogIn, String> {

	
//	For checking login with custom Query both below Queries are working
//	@Query(value = "SELECT COUNT(*) FROM LogIn WHERE userName = ?1 AND password = ?2",nativeQuery = true)
	@Query(value = "SELECT COUNT(*) FROM LogIn WHERE userName = :userName AND password = :password")
	public int logIn(String userName, String password);
	
	@Query(value = "SELECT LogIn FROM LogIn WHERE userName = :userName ")
	public LogIn LoginDetails(String userName);
	
}
