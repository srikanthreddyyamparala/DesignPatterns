package com.nt.proxy;

import com.nt.component.BankServiceImpl;
import com.nt.component.BankServices;

public class BankServiceProxy implements BankServices {
	private BankServices real=null;
	public BankServiceProxy(){
		System.out.println("BankServiceProxy.:::::::: 0-param Construtor");
		real=new BankServiceImpl();//real Object
	}
	@Override
	public String withdraw(long acno, float amount) {
		String msg=null;
		if(amount<=4000)
			msg=real.withdraw(acno, amount);
		else
			msg=real.withdraw(acno, 4000)+"only 4000 is allowed during Demonitization.";
		return msg;
	}

	@Override
	public String deposite(long acno, float amount) {
		String msg=null;
		if(amount<=10000)
			msg=real.deposite(acno, amount);
		else
			msg=real.deposite(acno, 10000)+"only 10000 is allowed during Demonitization.";
		return msg;
	}

}
