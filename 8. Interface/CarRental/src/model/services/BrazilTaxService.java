package model.services;

public class BrazilTaxService {
	
	public double tax(double amount) { 
		// tipo primitivo - não wrapper, por causa de uma operação interna
		
		if (amount <= 100.0) {
			return amount * 0.2;	
		}
		else {
			return amount * 0.15;
		}
	}
}
