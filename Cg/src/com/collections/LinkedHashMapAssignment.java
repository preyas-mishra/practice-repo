package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;

class Movie{
	int movieId;
	String movieName;
	String movieGenre;
	double movieBudget;
	public Movie(int movieId, String movieName, String movieGenre, double movieBudget) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieBudget = movieBudget;
	}
	
}

public class LinkedHashMapAssignment {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Movie> lhm = new LinkedHashMap<Integer, Movie>();
		Movie movie1 = new Movie(101,"Harry Potter","Fantasy Fiction",10000000);
		Movie movie2 = new Movie(102,"Fantastic Beast","Fantasy Fiction",5000000);
		Movie movie3 = new Movie(103,"The GodFather","Crime",50000000);
		Movie movie4 = new Movie(104,"Cast Away","Adventure Drama",1000000);
		
		lhm.put(1, movie1);
		lhm.put(2, movie2);
		lhm.put(3, movie3);
		lhm.put(4, movie4);
		System.out.println("All Movie Information");
		System.out.println("====================================");
		for(Map.Entry<Integer, Movie> m : lhm.entrySet()) {
			System.out.println("Map ID = "+m.getKey());
			System.out.println("Movie ID = "+m.getValue().movieId);
			System.out.println("Movie Name = "+m.getValue().movieName);
			System.out.println("Movie Genre = "+m.getValue().movieGenre);
			System.out.println("Movie Budget = "+m.getValue().movieBudget);
			System.out.println("--------------------------------------------");
			
		}
		System.out.println("====================================");
		System.out.println("Movie with Fantasy Fiction Genre");
		System.out.println("===================================");
		for(Map.Entry<Integer, Movie> m : lhm.entrySet()) {
			if(m.getValue().movieGenre=="Fantasy Fiction") {
			System.out.println("Map ID = "+m.getKey());
			System.out.println("Movie ID = "+m.getValue().movieId);
			System.out.println("Movie Name = "+m.getValue().movieName);
			System.out.println("Movie Genre = "+m.getValue().movieGenre);
			System.out.println("Movie Budget = "+m.getValue().movieBudget);
			System.out.println("--------------------------------------------");
			}
		}
	}

}
