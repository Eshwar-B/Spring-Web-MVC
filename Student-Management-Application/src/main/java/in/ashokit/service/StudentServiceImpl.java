package in.ashokit.service;

import java.util.List;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository repo;
	
	public StudentServiceImpl(StudentRepository repo)
	{
		this.repo = repo;
		System.out.println("Student service Impl :: constructor called...");
	}
	
	public boolean saveStudent(Student s)
	{
		Student savedStudent = repo.save(s);
		return s.getSid() != null;
	}
	
	
	public List<Student> getAllStudents()
	{
		List<Student> students = repo.findAll();
		return students;
	}

}
