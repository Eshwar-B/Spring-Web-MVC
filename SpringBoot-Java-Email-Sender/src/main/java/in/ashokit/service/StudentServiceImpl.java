package in.ashokit.service;

import java.util.List;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository repo;
	
	private EmailService emailService;
	
	public StudentServiceImpl(StudentRepository repo, EmailService emailService)
	{
		this.repo = repo;
		this.emailService = emailService;
		System.out.println("Student service Impl :: constructor called...");
	}
	
	public boolean saveStudent(Student s)
	{
		Student savedStudent = repo.save(s);
		
		String subject = "Student Registration";
		String body = " <h1> You account has been created in Eshwar official website. Confirm whether it is you or not! </h1> <br> <h3> Welcome </h3>";
		emailService.sendEmail(subject, body, s.getEmail());
		
		return s.getSid() != null;
	}
	
	
	public List<Student> getAllStudents()
	{
		List<Student> students = repo.findAll();
		return students;
	}

	@Override
	public void deleteStudent(Integer sid) {
		repo.deleteById(sid);
	}

}
