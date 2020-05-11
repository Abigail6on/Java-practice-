public class Exercise09_07
{
	public static void main(String[] args)
	{
		Account account = new Account(1122, 20000);
		Account.setAnnualInterestRate(4.5);

		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance is " + account.getBalance());
		System.out.println("Monthly interest is "
							+ account.getMonthlyInterest());
		System.out.println("This account was created at "
							+ account.getDateCreated());
		//System.out.println("Annul interest is "
				//+ account.getAnnualInterestRate());
		//System.out.println("Monthly Interest" + account.getMonthlyInterest());
	}
}

class Account{
	private int id = 0;
	private double balance  = 0.0;
	private static double annualInterestRate = 4.5;
	private java.util.Date dateCreated;
	public Account(){
		dateCreated = new java.util.Date ();
	}
	//public Account(int newId,double newBalance){
		//id = newId;
		//balance = newBalance;		
	//}
	public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
        return annualInterestRate;
	}
	public String getDateCreated() {
        return this.dateCreated.toString();
    }
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
	
	


	

