package HomeWork8;

public class UseLogger {

    public void startedTransaction (){
        Logger.info(TextMessages.STARTED.getMessage());
    }
    public void chargeTransaction (){
        Logger.info(TextMessages.CHARGE.getMessage());
    }
    public void chargeBackTransaction () {
        Logger.warning(TextMessages.CHARGEBACK.getMessage());
    }
    public void refundTransaction (){
        Logger.debug(TextMessages.REFUND.getMessage());
    }
    public void blockedTransaction (){
        Logger.error(TextMessages.BLOCKED.getMessage());
    }
    public void problemTransaction (){
        Logger.alarm(TextMessages.PROBLEM.getMessage());
    }
}

