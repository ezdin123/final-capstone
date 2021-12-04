package yenatLounge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import yenatLounge.model.User;
import yenatLounge.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userrepository;

	public User addMyUser(User user) {
		return userrepository.save(user);

	}

	// Get All Users
	public List<User> geAllMyUsers() {
		return userrepository.findAll();

	}

	public List<User> fetchUserByPhone(String phone) {
		return userrepository.findByPhone(phone);

	}

	// Find user by id
	public Optional<User> findUserByMyId(Long u_id) {
		return userrepository.findById(u_id);
	}

	public User findUserByMyUnameandUPass(String uname, String upass) {
		return userrepository.findUserByUnameandUPass(uname, upass);

	}

}
