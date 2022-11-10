package HW;




public class main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.productName = "Картоха";
        product1.marketPlace = "АТБ";
        product1.isAvailable = true;
        product1.startShoping();
        product1.canBuy();

        Product product2 = new Product();
        product2.productName = "Диня";
        product2.marketPlace = "Сільпо";
        product2.isAvailable = false;
        product2.startShoping();
        product2.canBuy();








    }
}