package HomeWork8;

public class StartUseLogger {
    public static void main(String[] args) {
        UseLogger useLogger = new UseLogger();
        useLogger.startedTransaction();
        useLogger.chargeTransaction();
        useLogger.chargeBackTransaction();
        useLogger.refundTransaction();
        useLogger.blockedTransaction();
        useLogger.problemTransaction();
    }
}
