package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw Limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		try {
			acc.withdraw(amount);
			System.out.print("New Balance: " + String.format("%.2f", acc.getBalance()));
		}
		catch (DomainException e) {
			System.out.print("Withdraw Error: " + e.getMessage());
		}
		sc.close();

	}

}
