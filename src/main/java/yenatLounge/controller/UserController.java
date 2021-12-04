package yenatLounge.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import yenatLounge.model.User;
import yenatLounge.service.UserService;

@RestController

public class UserController {
	@Autowired
	private UserService userservice;

	// @CrossOrigin(origins = "*", allowedHeaders = "*")

	// Get all Users
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userservice.geAllMyUsers();

	}

	// Add a User after checking if Phone Number already exists
	@PostMapping("/users")
	public User addUser(@RequestBody User user) throws Exception {
		String tempPhone = user.getPhone();
		if (tempPhone != null && !"".equals(tempPhone)) {
			List<User> userobj = userservice.fetchUserByPhone(tempPhone);
			if (userobj != null) {
				throw new Exception("user with " + tempPhone + " already exists");
			}
		}
		return userservice.addMyUser(user);
	}

	@PostMapping("/userlogin/{uname}")
	public User findUserByUnameandUPass(@RequestBody String uname, String upass) throws Exception {
		System.out.println(uname);
		System.out.println(upass);
		if (uname != null && upass != null) {
			return userservice.findUserByMyUnameandUPass(uname, upass);
		} else {
			throw new Exception("Bad credentials ");
		}

	}

	@GetMapping("/users/")
	public Optional<User> findUserById(@RequestBody Long u_id) {
		return userservice.findUserByMyId(u_id);
	}

}