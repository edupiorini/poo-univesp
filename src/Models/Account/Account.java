package Models.Account;

import Models.Client.Cliente;
import Models.Data.Data;

public class Account{

    private String accountNumber;
    private double balance = 200.0;
    private Data startingDate;
    //private Cliente[] correntistas;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setStartingDate(int day, int month, int year) {
        startingDate.setDate(day, month, year);
    }

    public Data getStartingDate() {
        return startingDate;
    }

    private void setBalance(Double value) {
        this.balance += value;
    }

    public Double getBalance() {
        return balance;
    }

    public boolean deposit(Double ammount) {
        if(ammount > 0){
        setBalance(ammount);
        System.out.println("Deposit done");
        return true;
        }else return false;
    }

    public boolean withdraw(Double ammount) {
        if (ammount <= getBalance()) {
            setBalance((ammount * (-1)));
            System.out.println("Success!");
            return true;
        } else {
            System.out.println("Not enough balance! Aborting...");
            return false;
        }
    }

    public boolean transferTo(Account destination, double ammount) {
        boolean withdrew = this.withdraw(ammount);

        if (withdrew == true) {
 
            setBalance((ammount * (-1.0)));
            destination.setBalance(ammount);
            System.out.println("Transferência concluída!");
            return true;

        } else {
            System.out.println("Transferência não realizada!");
            return false;
        }
    }

    public Account(String accountNumber, Double balance, Data startingDate, Cliente[] correntistas) {
        //throw exceptions
        if  (accountNumber == null) {
            throw new IllegalArgumentException( "accountNumber must have a valid value");
            
        }
        if (correntistas == null) {
            throw new IllegalArgumentException("Account must have at least one valid client");
            
        }
        
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.startingDate = startingDate;
        
    }

	public Account() {
	}



}
