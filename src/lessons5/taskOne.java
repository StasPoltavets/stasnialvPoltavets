package lessons5;


import java.util.Scanner;

public class taskOne {

        public static void main(String[] args) {

            // часть 1 - инициализация переменных
            int cardsPerPlayer = 5;
            int players = 0 ;

            String[] suits = {
                    "Піка", "Бубна", "Чирва", "Трефа"
            };

            String[] rank = {
                    "2", "3", "4", "5", "6", "7", "8", "9", "10",
                    "Валет", "Королева", "Король", "Туз"
            };

            int n = suits.length * rank.length; // количество карт


            // частина 2 - введення з консолі
            for(;;){
                Scanner sc = new Scanner(System.in);
                System.out.println("Ведіть кількість гравців: ");

                if(sc.hasNextInt()){

                    players = sc.nextInt();
                    if(cardsPerPlayer * players <= n){
                        break;
                    } else {
                        if (players ==0){

                            System.out.println("Кінець гри.");
                            break;

                        } else if (players<0){

                            System.out.println("ЧЧисло гравців не повинно бути менше 0");

                        } else{

                            System.out.println("Зайві гравці!");
                        }
                    }

                } else{
                    System.out.println("Введено не число, або Ваше число занадто велике!");

                }
            }


            // частина  3 - ініціалізація колоди
            String[] deck = new String[n];
            for (int i = 0; i < rank.length; i++) {
                for (int j = 0; j < suits.length; j++) {
                    deck[suits.length*i + j] = rank[i] + " " + suits[j];
                }
            }

            // частина 4 - тасування колоди
            for (int i = 0; i < n; i++) {
                int r = i + (int) (Math.random() * (n-i)); // свипадкова карта
                String temp = deck[r];
                deck[r] = deck[i];
                deck[i] = temp;
            }

            // частина 5 - виведення на екран
            for (int i = 0; i < players * cardsPerPlayer; i++) {
                System.out.println(deck[i]);
                if (i % cardsPerPlayer == cardsPerPlayer - 1)
                    System.out.println();
            }
        }

    }

