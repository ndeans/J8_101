package us.deans.javastudy8.base;

import us.deans.javastudy8.support.LogPrinter;

public class BaseOperation {

	protected LogPrinter lp;				// protected so child classes can access.
	
	public BaseOperation() {
		lp = LogPrinter.getInstance();		// set up reference variable for log printer.
	}
	
	
	public void start() {
		
	}

	public void start(int opt) {
		
	}
	
	public void end() {

	}
	
	
}
