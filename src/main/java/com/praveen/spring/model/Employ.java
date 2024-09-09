package com.praveen.spring.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="Employ")
public class Employ {
	
	@Id
	@Column(name="Empno")
	private String empNo;
	
	@Column(name="name") 	
	@Nonnull
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column(name="Gender")
	@Nonnull
	private Gender gender;
	
	@Column(name="Dept")
	@Nonnull
	private String dept;
	
	@Column(name="Desig")
	@Nonnull
	private String desig;
	
	@Column(name="Basic")
	@Nonnull
	private Long salary;
	
	@Column(name="status")
	@Nonnull
	private String status;
	
}
