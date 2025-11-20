package com.empresa;

public class LoopsWhile {

	public static void main(String[] args) {
		int i=1;
		while (i<=5) {
			System.out.println("Número " + i);
			i++;
		}
		
		while (true) {
			System.err.println(i);
			i++;	
		}

	}

}
