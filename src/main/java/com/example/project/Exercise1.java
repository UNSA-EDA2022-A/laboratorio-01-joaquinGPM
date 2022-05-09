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

		int num_decimal=0, digito, contador = 1, n;
	        int es_gabriel=1, min_significativo=0;

	        while (a>0)
	        {
	            digito = a%10;
	        
	        if(digito !=0 && digito !=1 && (digito==2 && min_significativo==0)){
	            es_gabriel=0;

	        }
	        if(digito==1){
	            min_significativo = 1;
	        }
	        int tap= (int) Math.pow(2,contador);
	        num_decimal=num_decimal+digito*(tap-1);
	        contador=contador+1;
	        a= a/10;
			
		}
	    if(es_gabriel ==1)
	        return ""+ num_decimal;
	    else
	    return "El numero proporcionado no esta en base Gabriel.";
	}
}
