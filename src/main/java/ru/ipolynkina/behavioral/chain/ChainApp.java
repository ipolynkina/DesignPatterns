package main.java.ru.ipolynkina.behavioral.chain;

import main.java.ru.ipolynkina.behavioral.chain.logger.EmailLogger;
import main.java.ru.ipolynkina.behavioral.chain.logger.FileLogger;
import main.java.ru.ipolynkina.behavioral.chain.logger.SMSLogger;

public class ChainApp {
    public static void main(String[] args) {

        SMSLogger smsLogger = new SMSLogger(Level.ERROR);
        FileLogger fileLogger = new FileLogger(Level.DEBUG);
        EmailLogger emailLogger = new EmailLogger(Level.INFO);
        smsLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(emailLogger);

        smsLogger.writeMessage("error!", Level.ERROR);
        System.out.println(" * * * ");
        smsLogger.writeMessage("debug", Level.DEBUG);
        System.out.println(" * * * ");
        smsLogger.writeMessage("info", Level.INFO);
    }
}
