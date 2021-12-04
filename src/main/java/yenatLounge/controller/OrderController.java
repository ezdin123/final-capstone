package yenatLounge.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import yenatLounge.model.Orders;
import yenatLounge.model.User;
import yenatLounge.service.OrderService;

@RestController

public class OrderController {

	@Autowired

	private OrderService orderservice;

	// Get all orders
	@GetMapping("/orders")
	public List<Orders> getAllOrders() {
		return orderservice.geAllMyorders();
	}

	/*
	 * Add order to Orders Table
	 * 
	 * @PostMapping("/orders") public List<Orders> addMyOrdertoCart(@Param(value =
	 * "p_id") long p_id, @Param (value="u_id")long u_id) { return
	 * orderservice.addMyOrder(p_id, u_id);
	 * 
	 * }
	 */

	// Fund user id from uname
	@GetMapping("/order/{uname}")
	public User findMyUserId(@PathVariable("uname") String uname) {
		return orderservice.findUserId(uname);
	}

	// Add a Product
	@PostMapping("/userorders")
	public Orders addOrders(@RequestBody Orders orders) {
		return orderservice.addMyOrder(orders);
	}

}