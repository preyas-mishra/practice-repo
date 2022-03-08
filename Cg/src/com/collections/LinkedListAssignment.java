package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

class Home{
	int homeId;
	String homeType;
	double homePrice;
	String homeLocation;
	public Home(int homeId, String homeType, double homePrice, String homeLocation) {
		this.homeId = homeId;
		this.homeType = homeType;
		this.homePrice = homePrice;
		this.homeLocation = homeLocation;
	}
	
}
public class LinkedListAssignment {

	public static void main(String[] args) {
		Home home1 = new Home(1001,"Flat",5400000.00,"Nashik");
		Home home2 = new Home(4013,"Bunglow",15400000.00,"Pune");
		Home home3 = new Home(1234,"Row House",2500000.00,"Mumbai");
		Home home4 = new Home(9765,"Apartment",1100000.00,"Banglore");
		LinkedList<Home>li = new LinkedList<Home>();
		li.add(home1);
		li.offer(home2);
		li.add(home3);
		li.offer(home4);
		Iterator<Home>it = li.iterator();
		while(it.hasNext()) {
			Home home = it.next();
			System.out.println("Home ID = "+home.homeId);
			System.out.println("Home Type = "+home.homeType);
			System.out.println("Home Price = "+home.homePrice);
			System.out.println("Home Location = "+home.homeLocation);
			System.out.println("--------------------------------");
		}
	}

}
