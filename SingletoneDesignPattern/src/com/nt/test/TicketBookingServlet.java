package com.nt.test;

import com.nt.sdp.Printer;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		Printer p=null;
		p=Printer.getInstance();
		System.out.println(p.hashCode()+"---->"+Thread.currentThread().getName());

	}

}
