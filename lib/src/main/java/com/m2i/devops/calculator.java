package com.m2i.devops;

public class calculator {
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mult(int a, int b) {
		return a*b;
	}
	
	public boolean mod(int a) {
		if(a % 2 == 0) {
			return true ;
		}else {
			return false;
		}		
		
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
