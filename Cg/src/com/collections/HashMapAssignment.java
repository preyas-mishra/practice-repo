package com.collections;

import java.util.HashMap;
import java.util.Map;

class CricketPlayer{
	int playerId;
	String playerName;
	String playerQuality;
	double playerSalary;
	public CricketPlayer(int playerId, String playerName, String playerQuality, double playerSalary) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerQuality = playerQuality;
		this.playerSalary = playerSalary;
	}
	
}

public class HashMapAssignment {

	public static void main(String[] args) {
		HashMap<Integer, CricketPlayer> hm = new HashMap<Integer,CricketPlayer>();
		CricketPlayer player1 = new CricketPlayer(49,"Smith","Batsman", 4000000);
		CricketPlayer player2 = new CricketPlayer(30,"Cummins","Bowler", 5000000);
		CricketPlayer player3 = new CricketPlayer(31,"Warner","Batsman", 3000000);
		CricketPlayer player4 = new CricketPlayer(32,"Maxwell","Allrounder", 2000000);
		
		hm.put(101, player1);
		hm.put(102, player2);
		hm.put(103, player3);
		hm.put(104, player4);
		
		for(Map.Entry<Integer, CricketPlayer> m : hm.entrySet()) {
			if(m.getValue().playerQuality=="Batsman") {
			System.out.println("Map ID = "+m.getKey());
			System.out.println("Player ID = "+m.getValue().playerId);
			System.out.println("Player Name = "+m.getValue().playerName);
			System.out.println("Player Quality = "+m.getValue().playerQuality);
			System.out.println("Player Salary = "+m.getValue().playerSalary);
			System.out.println("---------------------------------------");
			}
		}
		

	}

}
