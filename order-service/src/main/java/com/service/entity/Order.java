package com.service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/*
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(fluent = true)
@Getter*/
@Setter
public class Order {
	

	
	public int getOrderId() {
		return orderId;
	}
	public String getOrderDescription() {
		return orderDescription;
	}
	public String getOrderName() {
		return OrderName;
	}
	private int orderId;
	private String orderDescription;
	private String OrderName;
	
	public Order(int i, String string, String string2) {
		this.orderId =i;
		this.OrderName =string;
		this.orderDescription =string2;
	}

}
