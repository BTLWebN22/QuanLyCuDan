package com.example.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Condominum implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Integer number;
    private Double area;
    private Double price;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	public Condominum(){
		id=0;
	}

	public Condominum(int id, int number, Double are, double price) {
	this.id = id;
	this.number = number;
	this.area = are;
	this.price = price;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Double getArea() {
		return area;
	}
	
	public void setArea(Double area) {
		this.area = area;
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
