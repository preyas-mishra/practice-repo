package com.assignments;
class Player{
	int playerId;
	String playerName;
	int playerRuns;
	String role;
	public Player(int playerId, String playerName, int playerRuns, String role) {
		
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerRuns = playerRuns;
		this.role = role;
	}
	
	public String toString() {
		return "Player ID=" + playerId + ", Player Name=" + playerName + ", Player Runs=" + playerRuns + ", Role="
				+ role;
	}
	
}
public class ToStringAssignment {

	public static void main(String[] args) {
		Player player = new Player(49,"Smith",7000,"Batsman");
		Player player1 = new Player(30,"Pat",1000,"Bowler");
		System.out.println(player.toString());
		System.out.println(player1.toString());

	}

}
