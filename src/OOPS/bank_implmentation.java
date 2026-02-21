package OOPS;

public class bank_implmentation implements bank_app{
double balance;
	@Override
	public void account_registration(String accountId, String accountName, String accountType, double balance) {
		// TODO Auto-generated method stub
		this.balance=balance;
		System.out.println("Account is registerd "+accountId+" "+accountName+" "+balance);
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		int amount=500;
		if(balance>amount) {
			balance=balance-amount;
		}
		else {
			System.out.println("invalid amount of debit");
		}
		System.out.println("available balance is "+balance);
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		int amount=1500;
		balance=balance+amount;
		System.out.println("available balance is "+balance);
	}
	public static void main(String[] args) {
		bank_implmentation bank=new bank_implmentation();
		bank.account_registration("10012121", "hitu", "current", 11000.00);
		bank.debit();
		bank.credit();
	}

}
