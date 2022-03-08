package com.collections;

import java.util.Hashtable;
import java.util.Map;

class F1Data{
	int playerId;
	String teamName;
	String driverName;
	int playerRanking;
	public F1Data(int playerId, String teamName, String driverName, int playerRanking) {
		this.playerId = playerId;
		this.teamName = teamName;
		this.driverName = driverName;
		this.playerRanking = playerRanking;
	}
	
}

public class HashTableAssignment {

	public static void main(String[] args) {
		Hashtable<Integer,  F1Data> ht = new Hashtable<Integer, F1Data>();
		F1Data data1 = new F1Data(1,"Red Bull","Max Verstappen",2);
		F1Data data2 = new F1Data(44,"Mercedes","Lewis Hamilton",1);
		F1Data data3 = new F1Data(5,"Aston Martin","Sebastian Vettel",5);
		F1Data data4 = new F1Data(11,"Red Bull","Sergio Perez",4);
		F1Data data5 = new F1Data(63,"Mercedes","George Russell",3);
		
		ht.put(101, data1);
		ht.put(102, data2);
		ht.put(103, data3);
		ht.put(104, data4);
		ht.put(105, data5);
		
		System.out.println("All F1 Information");
		System.out.println("====================================");
		
		for(Map.Entry<Integer, F1Data> m : ht.entrySet()) {
			System.out.println("Map ID = "+m.getKey());
			System.out.println("Player ID = "+m.getValue().playerId);
			System.out.println("Team Name  = "+m.getValue().teamName);
			System.out.println("Driver Name = "+m.getValue().driverName);
			System.out.println("Driver Ranking = "+m.getValue().playerRanking);
			System.out.println("-----------------------------------------------");
		}
		System.out.println("====================================");
		System.out.println("Red Bull Drivers Information");
		System.out.println("====================================");
		
		for(Map.Entry<Integer, F1Data> m : ht.entrySet()) {
			if(m.getValue().teamName=="Red Bull") {
			System.out.println("Map ID = "+m.getKey());
			System.out.println("Player ID = "+m.getValue().playerId);
			System.out.println("Team Name  = "+m.getValue().teamName);
			System.out.println("Driver Name = "+m.getValue().driverName);
			System.out.println("Driver Ranking = "+m.getValue().playerRanking);
			System.out.println("-----------------------------------------------");
			}
		}
		
	}

}
