package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void LogToSystem(String message) {
		JLoggerManager manager = new JLoggerManager (); // newledik ancak injekte de edebilirdik. 
		manager.log(message);
		
	}

}
