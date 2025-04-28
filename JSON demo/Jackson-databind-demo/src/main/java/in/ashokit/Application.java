package in.ashokit;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

	public void convertJavaObjToJson() throws Exception {
		Customer c = new Customer();

		c.setName("Umesh");
		c.setGender("male");
		c.setPhno((long) 14369);
		c.setId(34);

		File f = new File("customer.json");

		ObjectMapper mapper = new ObjectMapper();

		mapper.writeValue(f, c);

		System.out.println("Object converted to JSON successfully !!");
	}
	
	
	public void convertJsonToJavaObj() throws Exception
	{
		
		Customer c = new Customer();
		
		ObjectMapper mapper = new ObjectMapper();
		
		Customer jsonToJava = mapper.readValue(new File("customer.json"), Customer.class);
		
		System.out.println("Java Object : " + jsonToJava.toString());
		
		System.out.println("Json converted to Java Object successfully !!");
	}

}
