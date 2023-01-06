package HW.phone;

public class PhoneExample {
    public static void main (String[] args) {
        Phone phone = new AndrioidPhone();
        phone.receiveSms("hello");

        phone = new Iphone();
        phone.receiveSms("hello");


        Iphone iphone2 =new Iphone();
        iphone2.makePhoto();
    }
}
