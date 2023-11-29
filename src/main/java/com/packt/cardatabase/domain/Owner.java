// Owner.java
package com.packt.cardatabase.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ownerid;
	private String firstname;
	private String lastname;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="owner")
	private List<Car> cars;
	
	public Owner() {
	}
	
	public Owner(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		}
	
		public Long getOwnerid() {
		return ownerid;
		}
		
		public String getFirstname() {
		return firstname;
		}
		
		public void setFirstname(String firstname) {
		this.firstname = firstname;
		}
		
		public String getLastname() {
		return lastname;
		}
		
		public void setLastname(String lastname) {
		this.lastname = lastname;
		}
		
		public List<Car> getCars() {
			return cars;
		}
		
		public void setCars(List<Car> cars) {
			this.cars = cars;
		}
		
		

	
}