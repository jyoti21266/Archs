package Archs.ChainOfResponsibillity.src.loggersLLD;

class DebugLogger extends Logger {
    public DebugLogger(int logLevel) {
        this.logLevel = logLevel;
    }
    @Override
    protected void write(String message) {
        System.out.println("DEBUG Logger: " + message);
    }
}