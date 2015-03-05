package PS3;

import java.io.*;
	/**
	 * Custom class for throwing an insufficient funds exception
	 * @author Dad
	 *
	 */
	public class InsufficientFundsExecption extends Exception
	{
	   private double amount;
	   /**
	    * Create an instance of the InsufficientFundsException class, to be thrown to the caller
	    * @param amount
	    */
	   public InsufficientFundsExecption(double amount)
	   {
	      this.amount = amount;
	   } 
	   public double getAmount()
	   {
	      return amount;
	   }
	}

