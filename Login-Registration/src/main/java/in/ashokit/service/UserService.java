package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public User saveUser(User user)
	{
		return userRepo.save(user);
	}
	
	
	public User validateUser(String email, String password)
	{
		User userByEmail = userRepo.findByEmail(email);
		
			if(userByEmail != null && userByEmail.getEmail().equals(password)){
				return userByEmail;
			}
		
		return null;
	}
	
	@Override
	public User validateUser(String email, String pwd) {
	    return repo.findByEmailAndPwd(email, pwd);
	}
}
