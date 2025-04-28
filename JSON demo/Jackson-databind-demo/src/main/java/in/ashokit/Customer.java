package in.ashokit;

public class Customer {
	
	private Integer id;
	private String name;
	private Long phno;
	private String gender;
	
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Long getPhno() {
		return phno;
	}
	public String getGender() {
		return gender;
	}
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phno=" + phno + ", gender=" + gender + "]";
	}

}
