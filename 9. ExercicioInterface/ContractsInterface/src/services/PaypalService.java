package services;

public class PaypalService implements OnlinePaymentService{
	
	private static final double PAYMENT_FEE = 0.02;
	private static final double MONTLY_INTEREST = 0.01;
	
	@Override
	public double paymentFee(double amount) {
		// TODO Auto-generated method stub
		return amount * PAYMENT_FEE;
	}

	@Override
	public double interest(double amount, int months) {
		// TODO Auto-generated method stub
		return amount * months * MONTLY_INTEREST;
	}

}
