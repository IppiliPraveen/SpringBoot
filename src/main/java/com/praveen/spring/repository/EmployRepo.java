package com.praveen.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.praveen.spring.model.Employ;
import com.praveen.spring.model.Gender;

@Repository
public interface EmployRepo extends JpaRepository<Employ, String>{
	
	public List<Employ> findByEmpNo(String empNo);
	
	@Query(value="SELECT COUNT(empNo) FROM Employ")
	public int genarateEmpID();

	@Query(value="insert into Employ (empNo,name, gender, dept, desig, salary, status) values (:empNo,:name,:gender,:dept,:desig,:salary,'a')")
	public void AddEmploy(String empNo, String name, Gender gender, String dept, String desig, Long salary);
	
	public Employ getByEmpNo(String empNo);
	
	@Query(value="SELECT u FROM Employ u where u.status='a'")
	public List<Employ> getActiveEmploy();


}