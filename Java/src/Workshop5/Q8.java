package Workshop5;

interface PaymentMethod {
	void processPayment();
}

class PaypalPayment implements PaymentMethod {
	@Override
	public void processPayment() {
		System.out.println("Processing PayPal payment");
	}
}

class OrderService {

	private PaymentMethod paymentMethod;

	public OrderService(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void makePayment() {
		paymentMethod.processPayment();
	}
}

public class Q8 {
	public static void main(String[] args) {

	}
}
