package PS3;

public class Test extends Account{
	public static void main(String[] args) throws InsufficientFundsExecption{
		Account Case= new Account(1122, 20000, 4.5);
		Case.deposit(3000);
		System.out.println("Balance is: " +Case.getBalance());
		System.out.println("Date is: "+ Case.getdateCreated());
		System.out.println("Monthly interest: " + Case.getMonthlyInterestRate());
		Case.withdraw(2500);
		System.out.println("Balance after $2,500 withdraw: " + Case.getBalance());
		
		System.out.println("Want to withdraw 1 million dollars");
		try {
			Case.withdraw(1000000);
		} catch (InsufficientFundsExecption e) {
			System.out.println("You will need: " + e.getAmount());
			e.printStackTrace();
		}
		}
	}
