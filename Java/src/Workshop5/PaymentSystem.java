package Workshop5;

import Workshop3.Main;

interface Payment {
	void pay(double amount);
}

class CreditCardPayment implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println(amount);
	}
}

class Esewa implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println(amount);
	}
}

class Khalti implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println(amount);
	}
}

class PaypalPayment5 implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println(amount);
	}
}

class PaymentProcessor {
	public void processPayment(Payment payment, double amount) {
		payment.pay(amount);
	}
}

public class PaymentSystem {
public static void main(String[] args) {
	PaymentProcessor paymentProcessor=new PaymentProcessor();
	Payment esewa=new Esewa();
	paymentProcessor.processPayment(esewa, 10);
}
}
