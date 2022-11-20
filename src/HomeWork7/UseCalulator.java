package HomeWork7;
import java.util.Scanner;
public class UseCalulator {
    public static void main(String[] args) {
        System.out.println("Choose type of calculator ");
        System.out.println("Basic / Pro");
        String typeCalc = new Scanner(System.in).nextLine();
        switch (typeCalc) {
            case "Basic":
                CalculatorBasic calcBasic = new CalculatorBasic();
                calcBasic.processWorksCalc();
                break;
            case "Pro":
                CalculatorPro calculatorPro = new CalculatorPro();
                calculatorPro.processWorksCalc();
                break;

        }
    }
}
