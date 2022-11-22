package HomeWork8;

public class Logger {
    static String info(String message) {
        System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "Message - " + message);
        return "NULL";
    }
    static String debug(String message) {
        System.out.println(ConsoleColors.CYAN_BACKGROUND + "Message - " + message);
        return "NULL";
    }
    static String warning(String message) {
        System.out.println(ConsoleColors.YELLOW_BRIGHT + "Message - " + message);
        return "NULL";
    }
    static String error(String message) {
        System.out.println(ConsoleColors.RED_BRIGHT + "Message - " + message);
        return "NULL";
    }
    static String alarm (String message) {
        System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "Message - " + message);
        return "NULL";
    }

}

