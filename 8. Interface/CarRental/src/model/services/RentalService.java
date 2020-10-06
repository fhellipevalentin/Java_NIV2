package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	private Double pricePerDay;
	private Double pricePerHour;
	
	private BrazilTaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		//responsavel por gerar a nota de pagamento
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
										//milisegundos
		double hours = (double) (t2 - t1) / 1000 / 60 / 60;
//em double para arrendondar depois - casting e convertendo de milisegundos em minutos, de minutos em horas
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		}
		else {
			basicPayment = Math.ceil(hours /24) * pricePerDay; 
		}
		double tax = taxService.tax(basicPayment);//calcula o imposto a partir de basicPayment
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
		//cria um novo objeto de pagamento e associa com o objeto de aluguel
	}
	
}
