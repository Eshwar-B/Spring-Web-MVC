package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	private String name;
	private String email;
	private Long phno;

	
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	
	
	public Integer getSid() {
		return sid;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public Long getPhno() {
		return phno;
	}
		
}
