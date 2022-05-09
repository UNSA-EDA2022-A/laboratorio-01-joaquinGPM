package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {

		int piedras=7,maximosalto=50;
		int saltos[],i;
		saltos= new int[piedras+1];
		saltos[0] = 0;
		for (i=1;i<=piedras;i++) {
			saltos[i]=a [i-1];}
		if(a[i]>a[i-1]+50];i++)
		for(i=0;i<=piedras;i++) {
			
		}
		
		for(i=1;i<=piedras;i++) {
			
			
		}
		return -1;
	}
}
