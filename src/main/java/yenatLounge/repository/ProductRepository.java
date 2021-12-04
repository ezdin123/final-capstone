package yenatLounge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import yenatLounge.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByCusine(String cusine);
//	List<Product> findById(Long p_id);
}