package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;
	
	private String email;
	private String pwd;
	
	public Integer getUid() {
		return uid;
	}
	public String getEmail() {
		return email;
	}
	public String getPwd() {
		return pwd;
	}
	
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", email=" + email + ", pwd=" + pwd + "]";
	}
	
	
	
}
