package com.example.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Service implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String name;
    private String unit;
    private Double price;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	public Service(){
		id=0;
	}

	public Service(int id, String name, String unit, double price) {
	this.id = id;
	this.name = name;
	this.unit = unit;
	this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
}
