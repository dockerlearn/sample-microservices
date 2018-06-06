package com.myapp.cloud.rest.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.cloud.domain.Order;
import com.myapp.cloud.messaging.PaymentGateway;
import com.myapp.cloud.repository.OrderRepository;

@RestController
public class OrderAPI {
	
	// Dependency Injection
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private PaymentGateway paymentGateway;
	
	// http://IP:PORT/orders
	@GetMapping("/orders")
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list=new ArrayList<>();
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		list.add(new Order(0001,"dummyorder2",0.01));
		
	return new ResponseEntity<List<Order>>(orderRepository.findAll(), HttpStatus.OK);
//		return new ResponseEntity<List<Order>>(list, HttpStatus.OK);
	}
	
	
	
	// http://IP:PORT/orders
	@PostMapping("/orders")
	public ResponseEntity<String> placeAnOrder(@RequestBody Order order){
		
		order.setName(order.getName()+"*******");
		
		orderRepository.save(order);
		paymentGateway.publish(order.getPayment());
		return new ResponseEntity<String>("Order Placed ", HttpStatus.CREATED);
	}
	
	
	
	

}
