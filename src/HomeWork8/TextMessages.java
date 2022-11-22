package HomeWork8;

public enum TextMessages {
    STARTED("Create transaction"),
    CHARGE("Success charge transaction"),
    REFUND("Refund transaction"),
    CHARGEBACK("Chargeback transaction"),
    BLOCKED("Blocked transaction"),
    PROBLEM("Problem transaction");
    private String message;
    TextMessages(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}

