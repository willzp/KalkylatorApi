package com.example.demo;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController implements ErrorController {
	
	
	plusCalculation plus = new plusCalculation();
    minusCalculation minus = new minusCalculation();
    timesCalculation times = new timesCalculation();


@RequestMapping(value ="/kalkylator",  method = RequestMethod.GET)
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

@RequestMapping(value = "/error", method = RequestMethod.GET)
public String error(HttpServletResponse response) {
	
	if(response.getStatus() == HttpStatus.NOT_FOUND.value()) {
		return "404 not found";
	}
	else if(response.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
		return "error 500";
	}
	else {
		
		return "error, try agin!" ;
	}	
	
  }

}


