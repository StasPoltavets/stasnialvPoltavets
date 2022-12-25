package HomeWork10b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductList {

    public static void main(String[] args) {
        ProductList productList = new ProductList();
        productList.fillProduct();
        productList.sumListProduct();

    }
    Map<String, Integer> product = new HashMap<>();

    public void fillProduct(){
        String answer = "Y";
        while (answer.equals("Y")){
            System.out.println("Enter name of product");

            String name = new Scanner(System.in).next();
            System.out.println("Enter quantity of product");

            int key = new Scanner(System.in).nextInt();
            this.product.put(name, key);

            System.out.println("Continue shopping? Y/N");
            answer = new Scanner(System.in).next();

        }
    }
    public void sumListProduct () {
        int sum = 0;
        for (int i : product.values()) {
            sum = sum+i;
        }
        System.out.println("Sum all product " +sum);
    }

}
