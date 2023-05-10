package com.example.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "manager")
public class Manager {
	@Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long Id;

    @Column(name = "Managername", length = 36, nullable = false)
    private String ManagerName;

    @Column(name = "Password", length = 128, nullable = false)
    private String passWord;

    @Column(name = "Name", length = 128, nullable = false)
    private String name;
    @Column(name = "Tel", length = 12, nullable = false)
    private String tel;
    @Column(name = "Email", length = 128, nullable = false)
    private String email;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getManagerName() {
		return ManagerName;
	}
	public void setManagerName(String ManagerName) {
		this.ManagerName = ManagerName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Manager() {
		super();
	}
	public Manager(Long id, String ManagerName, String passWord, String name, String tel, String email) {
		super();
		Id = id;
		this.ManagerName = ManagerName;
		this.passWord = passWord;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
    
}
