package com.solid.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Logging
 * 
 * @author taila
 *
 */
public class ConsoleLogger {
	
	private Logger logger = Logger.getLogger(ConsoleLogger.class.getName());
	
	public void writeNotify(String msgNotifyString) {
		logger.severe(msgNotifyString);
	}
	
	public void writeInfor(String msgInfoString) {
		logger.info(msgInfoString);
	}
	
	public void writeError(String msgErrorString, Exception exception) {
		logger.log(Level.ALL, msgErrorString, exception);
	}
	
	public void writeWarning(String msgWarningString) {
		logger.log(Level.WARNING, msgWarningString);
	}
	
	public int writeResult(Integer inNum) {
		return inNum;
	}
}
