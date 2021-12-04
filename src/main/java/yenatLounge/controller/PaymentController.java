package yenatLounge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import yenatLounge.model.Payment;
import yenatLounge.service.PaymentService;

@RestController

public class PaymentController {

	@Autowired

	private PaymentService paymentservice;

	@PostMapping("/addpayment")
	public Payment addPayment(@RequestBody Payment payment) {
		return paymentservice.addMyPayment(payment);
	}

	@GetMapping("/payment")
	public List<Payment> getAllPayments() {
		return paymentservice.getAllMyPayment();
	}

}