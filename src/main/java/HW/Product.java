package HW;

public class Product {
    String productName;
    String marketPlace;
    boolean isAvailable;

    public Product () {
    }
    public void startShoping(){
        System.out.println("Select " + this.marketPlace+ " and press Start button");
        System.out.println("Select " +this.productName+ " and add to the Basket");
    }

    public void canBuy () {
        if (this.isAvailable) {
            System.out.println("Звісно");
        } else {
            System.out.println("Що ми говоримо безликому, Не сьогодні!");
        }
    }
}
