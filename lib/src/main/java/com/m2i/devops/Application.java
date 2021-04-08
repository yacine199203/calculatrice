package com.m2i.devops;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hello word");

	}
	
	public void nbrprem(int a) {
		int tab[ ] = new int[a];
		for(int i=1;i<=a;i++) {
			if(i % 2 != 0) {
				tab[i] = i;
				System.out.println(tab[i]);
			}
		}
	}

}
