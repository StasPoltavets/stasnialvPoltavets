package HomeWork8;

public class Logger {
    static void info(String message) {
        System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "Message - " + message);

    }
    static void debug(String message) {
        System.out.println(ConsoleColors.CYAN_BACKGROUND + "Message - " + message);

    }
    static void warning(String message) {
        System.out.println(ConsoleColors.YELLOW_BRIGHT + "Message - " + message);

    }
    static void error(String message) {
        System.out.println(ConsoleColors.RED_BRIGHT + "Message - " + message);

    }
    static void alarm (String message) {
        System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "Message - " + message);

    }

}

