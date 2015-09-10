package com.datametica.test;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k,m;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of lines to be printed");
		i=sc.nextInt();
		m=i-1;
		for (int l = 0; l < i; l++) {

			k=0;
			j=m-l;
		while(j>0) {
			System.out.print("-");
			j--;
		}
		while(k<=l){
			System.out.print("*");
			k++;
		}
		System.out.println(" ");
	}

}
}
