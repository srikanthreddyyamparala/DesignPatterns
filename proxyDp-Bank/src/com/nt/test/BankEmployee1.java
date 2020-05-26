package com.nt.test;

import com.nt.component.BankServices;
import com.nt.constantes.RBIConstantes;
import com.nt.factory.BankServiceFactory;

public class BankEmployee1 {

	public static void main(String[] args) {
		BankServices service=null,service1=null;
		service=BankServiceFactory.getInstance(RBIConstantes.DEMONITIZATION);
		System.out.println(service.deposite(1001, 20000));
		System.out.println(service.withdraw(1002,5000));
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		service1=BankServiceFactory.getInstance(RBIConstantes.REGULARBANKING);
		System.out.println(service1.deposite(1003, 8000));
		System.out.println(service1.withdraw(1004, 2000));
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");

	}

}
