package PS3;

import java.util.Date;


public class Account {
	
	private int ID=0;
	private double balance= 0;
	private double Annual_Interest_Rate = 0;
	private java.util.Date dateCreated;
	
	public Account(){
	}
	public Account(int ID, double balance, double Annual_Interest_Rate){
		this.setId(ID);
		this.getBalance(balance);
		this.getAnnualInterestRate(Annual_Interest_Rate);
		this.dateCreated= new java.util.Date();
	}
	public int getId(){
		return ID;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return Annual_Interest_Rate;
	}
	public void setId(int ID){
		this.ID= ID;
	}
	public void getBalance(double balance){
		this.balance= balance;
	}
	public void getAnnualInterestRate(double Annual_Interest_Rate){
		this.Annual_Interest_Rate= Annual_Interest_Rate;
	}
	public java.util.Date getdateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		return balance*((Annual_Interest_Rate/100)/12);
	}
	public void withdraw(double amount)throws InsufficientFundsExecption{
		if (amount <= balance){
			balance= balance - amount;
		}
		else{
			double needed = amount - balance;
			throw new InsufficientFundsExecption(needed);
		}
	}
	public void deposit(double amount){
		balance = amount+balance;
	}

}
