package yenatLounge.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import yenatLounge.model.Payment;


public interface PaymentRepository extends JpaRepository <Payment, Long> {
		

}
