package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Student;

public interface StudentService 
{
	// to save the student information inside the database table
	public boolean saveStudent(Student s);
	
	//to get all the students from the database table
	public List<Student> getAllStudents();
	
	// to delete students from table
	public void deleteStudent(Integer sid);
}
