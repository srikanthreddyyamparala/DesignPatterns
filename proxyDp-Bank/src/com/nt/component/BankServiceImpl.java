package com.nt.component;
//Concreate Component class
public class BankServiceImpl implements BankServices {

	public BankServiceImpl(){
		System.out.println("BankServiceImpl:::::::::0-param Constructor");
	}
	@Override
	public String withdraw(long acno, float amount) {
		System.out.println("BankServiceImpl.withdraw()");
		
		return "Withdrawing amount::"+amount+" from the bank account number::"+acno;
	}

	@Override
	public String deposite(long acno, float amount) {
		System.out.println("BankServiceImpl.deposite()");
		return "deposite amount::"+amount+" into bank account number::"+acno;
	}

}
