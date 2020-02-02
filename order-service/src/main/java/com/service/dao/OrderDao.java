package com.service.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.service.entity.Order;

@Component
public class OrderDao {

	// Dummy database
	private static List<Order> orders;
	{
		  orders = new ArrayList<Order>();
		  orders.add(new Order(100, "Dharmendra", "Pawar")); 
		  orders.add(new Order(101, "John", "Doe")); 
		  orders.add(new Order(201, "Russ", "Smith"));
		 
		 

	}

	public List<Order> list() {
		return this.orders;
	}

	/*
	 * public Order get(Long id) {
	 * 
	 * for (Order c : orders) { if (c.getId().equals(id)) { return c; } } return
	 * null; }
	 */

	/*
	 * public Order create(Order Order) {
	 * 
	 * List<Order> ordersTemp;
	 * 
	 * if (Order.getId() == null) { Order.setId(System.currentTimeMillis());
	 * orders.add(Order); } else { ordersTemp = orders; for (int i = 0; i <
	 * ordersTemp.size(); i++) {
	 * 
	 * if (Order.getId().equals(ordersTemp.get(i).getId())) {
	 * orders.get(i).setEmail(Order.getEmail());
	 * orders.get(i).setMobile(Order.getMobile());
	 * orders.get(i).setFirstName(Order.getFirstName()); }
	 * 
	 * } } return Order; }
	 * 
	 * public Long delete(Long id) {
	 * 
	 * for (Order c : orders) { if (c.getId().equals(id)) { orders.remove(c); return
	 * id; } }
	 * 
	 * return null; }
	 * 
	 * public Order update(Long id, Order Order) {
	 * 
	 * for (Order c : orders) { if (c.getId().equals(id)) { Order.setId(c.getId());
	 * orders.remove(c); orders.add(Order); return Order; } }
	 * 
	 * return null; }
	 */
}