package ua.hillel.homework10;

import  java.util.ArrayList;
import java.util.Random;
//added something
public class Cinderella {
    public static void main(String[] args) {

        ArrayList<Integer> collection = new ArrayList<>();
        ArrayList<Integer> basket1 = new ArrayList<>();
        ArrayList<Integer> basket2 = new ArrayList<>();
        ArrayList<Integer> basket3 = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            collection.add(random.nextInt(50));
        }
        System.out.println("All numbers " + collection);
        for (int number : collection) {
            boolean isDividableByFive = number % 5 == 0;
            boolean isDividableByTwo = number % 2 == 0;

            boolean isSuitableForFirstBasket = isDividableByTwo;
            boolean isSuitableForSecondBasket = isDividableByFive && number % 3 != 0;
            boolean isSuitableForThirdBasket = !isDividableByFive && !isDividableByTwo;

            if (isSuitableForSecondBasket) {
                basket2.add(number);
            } else if (isSuitableForFirstBasket) {
                basket1.add(number);
            } else if (isSuitableForThirdBasket) {
                basket3.add(number);
            }
        }
        System.out.println("Number % 2 in the first basket " + basket1);
        System.out.println("Number % 5 & % 3!=0 in the second basket " + basket2);
        System.out.println("Number is not % 5 & % 2 in the in the third basket " + basket3);
    }

}

