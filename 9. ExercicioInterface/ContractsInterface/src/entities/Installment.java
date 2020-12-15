package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dueDate;
	private Double amount;
	
	public Installment(Date duoDate, Double amount) {
		this.dueDate = duoDate;
		this.amount = amount;
	}

	public Date getDuoDate() {
		return dueDate;
	}

	public void setDuoDate(Date duoDate) {
		this.dueDate = duoDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return sdf.format(dueDate) + "- " + String.format("%.2f", amount);
	}
	
}
