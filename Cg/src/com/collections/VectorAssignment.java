package com.collections;

import java.util.Enumeration;
import java.util.Vector;

class Order{
	int orderId;
	String orderName;
	String orderLocation;
	int orderPrice;
	public Order(int orderId, String orderName, String orderLocation, int orderPrice) {
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderLocation = orderLocation;
		this.orderPrice = orderPrice;
	}
}

public class VectorAssignment {

	public static void main(String[] args) {
		Order order1 = new Order(101,"Desktop","Nashik",10000);
		Order order2 = new Order(102,"Laptop","Pune",50000);
		Order order3 = new Order(103,"Keyboard","Mumbai",4000);
		Vector<Order> v = new Vector<Order>();
		v.add(order1);
		v.add(order2);
		v.add(order3);
		Enumeration<Order> e = v.elements();
		while(e.hasMoreElements()) {
			Order order = e.nextElement();
			System.out.println("Order Id = "+order.orderId);
			System.out.println("Order Name = "+order.orderName);
			System.out.println("Order Location = "+order.orderLocation);
			System.out.println("Order Price = "+order.orderPrice);
			System.out.println("-------------------------------");
		}

	}
}
