package com.GEEKSTER.Weekly.Test3.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
	
	  private String title;
	  private String description;
	  private String location;
//	  (hint @min for salary : should be above 20,000 )
	  @Min(value = 20000)
	  private Double salary;
	  
	  @Email
	  private String companyEmail; 
      @NotEmpty
	  private String companyName;
	  @NotEmpty
	  private String employerName;
	  
	  @Enumerated(EnumType.STRING)
	  private Jobtype jobtype;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public Jobtype getJobtype() {
		return jobtype;
	}

	public void setJobtype(Jobtype jobtype) {
		this.jobtype = jobtype;
	}

	  

}
