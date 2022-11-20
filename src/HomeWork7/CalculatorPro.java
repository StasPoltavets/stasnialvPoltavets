package HomeWork7;
import java.util.Scanner;
public class CalculatorPro extends CalculatorBasic {

    @Override
    public void executeOperation() {
        switch (operation) {
            case "sqrt":
                setNum(1, 1);
                getRoot();
                break;
            case "sin":
                setNum(1, 1);
                getSinx();
                break;
        }
    }
    public void getRoot() {
        num1 = Math.sqrt(num2);
        System.out.println("Корінь " + num1);
    }
    public void getSinx() {
        num1 = Math.sin(num2);
        System.out.println("Sin( " + num2 + " ) = " + num1);
    }
    @Override
    public void processWorksCalc() {
            System.out.println("Виберіть дію sin, sqrt");
            setOperation();
            executeOperation();
    }
}