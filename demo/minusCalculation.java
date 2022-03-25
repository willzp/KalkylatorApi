package com.example.demo;

public class minusCalculation {
	
public String Minus(String nr1, String nr2) {
		
		int num1 = Integer.parseInt(nr1);
		int num2 = Integer.parseInt(nr2);
		int summan = num1 - num2;
		
		return "Summan av " + num1 + " - " + num2 + " = " + String.valueOf(summan);
		
	}

}
