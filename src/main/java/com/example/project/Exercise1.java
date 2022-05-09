package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {

		
			int  numerominimo=0;
			int decimal=0, ultimonum, c = 1;
			boolean J=true;
	        

	        while (a>0)
	        {
	        	ultimonum = a%10;
	        
	        if(ultimonum !=1 && ultimonum !=0 && !(numerominimo==0&&ultimonum== 2 )){
	           J= false;

	        }
	        if(ultimonum!=0){
	        	numerominimo = 1;
	        }
	        int convercion= (int) Math.pow(2,c);
	        decimal=decimal+ultimonum*(convercion-1);
	        c=c+1;
	        a= a/10;
			
		}
	    if(J ==true)
	        return ""+ decimal;
	    else
	    return "El numero proporcionado no esta en base Gabriel.";
	}
}
