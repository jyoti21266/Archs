package Archs.ChainOfResponsibillity.src.loggersLLD;

public class ChainOfResponsibilityPatternDemo {
    public static void main(String[] args) {
        Logger loggerChain = LoggerChain.getChainOfLoggers();
        System.out.println("Logging an INFO level message:");
        loggerChain.logMessage("This is an informational message.", Logger.INFO);
        System.out.println("\nLogging a DEBUG level message:");
        loggerChain.logMessage("This is a debug message.", Logger.DEBUG);
        System.out.println("\nLogging an ERROR level message:");
        loggerChain.logMessage("This is an error message.", Logger.ERROR);
    }
}