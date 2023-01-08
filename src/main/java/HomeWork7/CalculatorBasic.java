package HomeWork7;

import java.util.Scanner;

public class CalculatorBasic {
    Double num1, num2;
    String operation;

    public void setNum() {
        System.out.println("Введіть число");
        this.num1 = Double.valueOf(new Scanner(System.in).nextLine());
        System.out.println("Введіть число");
        this.num2 = Double.valueOf(new Scanner(System.in).nextLine());
    }
    public void setNum(int sqrt, int sin ) {
        System.out.println("Введіть число");
        this.num2 = Double.valueOf(new Scanner(System.in).nextLine());
    }

    public void setOperation() {
        System.out.println("Введіть операцію");
        this.operation = new Scanner(System.in).nextLine();
    }

    public void executeOperation() {
        switch (operation) {
            case "+":
                getSumm();
                break;
            case "-":
                getSubtraction();
                break;
            case "*":
                getMultiplication();
                break;
            case "/":
                getDivision();
                break;
        }

    }

    public void getSumm() {
        System.out.println(num1 + num2);
    }

    public void getSubtraction() {
        System.out.println(num1 - num2);
    }

    public void getMultiplication() {
        System.out.println(num1 * num2);
    }

    public void getDivision() {System.out.println(num1 / num2);}

    public void processWorksCalc() {
            setNum();
            setOperation();
            executeOperation();
    }

}