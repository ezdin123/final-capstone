package yenatLounge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import yenatLounge.model.Orders;
import yenatLounge.model.User;

@Repository("orderrepository")
public interface OrderRepository extends JpaRepository<Orders, Long> {

	// getCartByUserId;
	// @Query(value="SELECT o FROM Orders o WHERE o.u_id=?1",nativeQuery=true)
	// List<Orders> getCartbyUserId(@Param("u_id") Long u_id);

	// Find UserId by Uname passed in the parameter
	@Query(value = "SELECT * FROM User u WHERE u.uname=?1", nativeQuery = true)
	public User findUserIdByUname(@Param("uname") String uname);

}
