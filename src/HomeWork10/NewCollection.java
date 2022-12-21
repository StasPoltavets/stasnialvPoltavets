package HomeWork10;

import java.util.*;

public class NewCollection {
    public static void main(String[] args) {
        NewCollection newCollection = new NewCollection();
        newCollection.DelateDuolicateNumbers(newCollection.CreateList());

    }
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> CreateList(){
        Random random = new Random();
        for (int i =0; i <100; i++){
            list.add(random.nextInt(50));
        }
        System.out.println("Main collection with random numbers  " + list);
        return list;
    }
    public void DelateDuolicateNumbers(List<Integer> list){
        Set set =new LinkedHashSet(list);
        int size = list.size() - set.size();
        System.out.println("Collection without duplicate numbers "+ set);
        System.out.println("Number of deleted numbers is " + size);
    }
}
