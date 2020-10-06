package model.services;

public class BrazilTaxService {
	
	public double tax(double amount) { 
		// tipo primitivo - n�o wrapper, por causa de uma opera��o interna
		
		if (amount <= 100.0) {
			return amount * 0.2;	
		}
		else {
			return amount * 0.15;
		}
	}
}
