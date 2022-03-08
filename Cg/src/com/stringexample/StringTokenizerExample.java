package com.stringexample;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("My ,name ,is ,Preyas Prashant Mishra");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken(","));
		}
	}

}


// boolean hasMoreTokens() -> it checks if there is more tokens available 
// String nextToken() -> it returns next token
// String nextToken(String delim) -> it returns next token based on delimiter
