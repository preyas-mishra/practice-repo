package com.collections;

import java.util.Map;
import java.util.TreeMap;

class Car{
	int carNumber;
	String carName;
	double carPrice;
	public Car(int carNumber, String carName, double carPrice) {
		this.carNumber = carNumber;
		this.carName = carName;
		this.carPrice = carPrice;
	}
	
}
public class TreeMapAssignment {

	public static void main(String[] args) {
		TreeMap<Integer,Car> tm = new TreeMap<Integer,Car>();
		Car car1 = new Car(1001,"Mclaren",1000000);
		Car car2 = new Car(1004,"Mercedes",5000000);
		Car car3 = new Car(1005,"Bentley",7000000);
		tm.put(101, car1);
		tm.put(100, car2);
		tm.put(99, car3);
		
		for(Map.Entry<Integer, Car>m:tm.entrySet()) {
			System.out.println("Map ID = "+m.getKey());
			System.out.println("Car Number = "+m.getValue().carNumber);
			System.out.println("Car Name = "+m.getValue().carName);
			System.out.println("Car Price = "+m.getValue().carPrice);
			System.out.println("---------------------------------");
		}
	}

}
