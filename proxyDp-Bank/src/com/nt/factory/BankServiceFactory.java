package com.nt.factory;

import com.nt.component.BankServiceImpl;
import com.nt.component.BankServices;
import com.nt.proxy.BankServiceProxy;

public class BankServiceFactory {
	public static BankServices getInstance(boolean demonitization){
		BankServices services=null;
		if(demonitization){
			services=new BankServiceProxy();
		}else{
			services=new BankServiceImpl();
		}
		return services;
	}
}
