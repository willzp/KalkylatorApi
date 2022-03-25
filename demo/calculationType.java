package com.example.demo;

public class calculationType {
	
	plusCalculation plus = new plusCalculation();
    minusCalculation minus = new minusCalculation();
    timesCalculation times = new timesCalculation();
    
	public String CalculationType(String nr1, String nr2, String typ) {
		
		if(typ.equals("plus")) {
			return  plus.Plus(nr1, nr2);
		}
		if(typ.equals("minus")) {
			return  minus.Minus(nr1, nr2);
		}
		if(typ.equals("ganger")) {
			return  times.Times(nr1, nr2);
		}
		return "Ange giltigt räknesätt";
	}

}
