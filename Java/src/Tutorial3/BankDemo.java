package Tutorial3;

class NRB {
	int x = 100;

	void provideLoan() {
		System.out.println("General rule by NRB");
	}
}

class NabilBank extends NRB {
	int x = 10;

	@Override
	void provideLoan() {
		System.out.println("Nabil loan scheme");
	}
	
	void provideCredit() {
		System.out.println("Credit");
	}
}

class NICAsia extends NRB {
	int x = 5;

	@Override
	void provideLoan() {
		System.out.println("NICAsia loan scheme");
	}

	void provideInterest() {
		System.out.println("NIC interest");
	}
}

public class BankDemo {
	public static void provideLoan(NRB bank) {
		bank.provideLoan();
	}
	
	public static void main(String[] args) {
		NRB bank; // NRB reference
		
		NabilBank bank1 = new NabilBank(); // NabilBank Object
		bank = bank1; // Upcasting4
		System.out.println(bank.x);
		provideLoan(bank1);

		bank = new NICAsia(); // Direct Upcasting of NICAsia
		System.out.println(bank.x);
		provideLoan(bank);
	}

}
