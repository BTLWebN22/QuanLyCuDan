package com.example.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	
	private String condominumId;
	
	@NotBlank
	private String phone;
	
	@NotBlank
	private String cccd;
	
	private String service;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	public User(){
		id=0;
	}

	public User(int id, String name,String condominumId, String phone, String cccd, String service) {
	this.id = id;
	this.name = name;
	this.condominumId = condominumId;
	this.phone = phone;
	this.cccd = cccd;
	this.service = service;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCondominumId() {
		return condominumId;
	}
	
	public void setCondominumId(String condominumId) {
		this.condominumId = condominumId;
	}

	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String getCccd() {
		return cccd;
	}
	
	public void setCccd(String cccd) {
		this.cccd = cccd;
	}
	
	
	public String getService() {
		return service;
	}
	
	public void setService(String service) {
		this.service = service;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
}
