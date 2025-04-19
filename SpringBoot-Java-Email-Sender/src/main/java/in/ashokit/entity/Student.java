package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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

	@CreationTimestamp
	private LocalDate createdDate;
	@UpdateTimestamp
	private LocalDate updatedDate;
	
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
