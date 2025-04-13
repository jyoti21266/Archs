package Archs.ChainOfResponsibillity.src.loggersLLD;

abstract class Logger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    protected int logLevel;
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
    public void logMessage(String message, int level) {
        if(this.logLevel <= level) {
            write(message);
        }
        if(this.nextLogger != null) {
            nextLogger.logMessage(message, level);
        }
    }
    protected abstract void write(String message);
}