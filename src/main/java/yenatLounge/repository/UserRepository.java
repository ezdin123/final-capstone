package yenatLounge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import yenatLounge.model.User;

@Repository("userrepository")
public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByPhone(String phone);

	@Query(value = "SELECT * from User u where u.uname=?1 and u.upass=?2", nativeQuery = true)
	public User findUserByUnameandUPass(String uname, String upass);

}
