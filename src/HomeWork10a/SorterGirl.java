package HomeWork10a;

import java.util.ArrayList;
import java.util.Random;

public class SorterGirl {
    public static void main(String[] args) {
        SorterGirl sorterGirl = new SorterGirl();
        sorterGirl.divideList(sorterGirl.FillList());
    }
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> divideTo2 = new ArrayList<>();
    ArrayList<Integer> divideTo3 = new ArrayList<>();
    ArrayList<Integer> others = new ArrayList<>();

    public ArrayList<Integer> FillList () {
        Random random = new Random();
        for (int i = 0; i<100; i++){
            list.add(random.nextInt(50)+1);
        } return list;
    }

    public void divideList (ArrayList<Integer> list){
        for ( int i : list){
            if (i %2==0 && i%3==0) {
                divideTo2.add(i);
                divideTo3.add(i);
            } else if (i%2==0){
                divideTo2.add(i);
            } else if (i%3==0) {
                divideTo3.add(i);
            } else {others.add(i);
            }
        }
        System.out.println("Basket with numbers which divide to 2 " + divideTo2);
        System.out.println("Basket with numbers which divide to 3 " + divideTo3);
        System.out.println("Basket with other numbers "+ others);
    }
}
