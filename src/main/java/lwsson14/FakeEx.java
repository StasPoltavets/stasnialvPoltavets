package lwsson14;

import com.github.javafaker.Faker;

public class FakeEx {
    public static void main(String[] args) {
        Faker faker = new Faker();
        for (int i=0; i<5; i++){
            String name = faker.name().firstName();
            String lastName = faker.name().lastName();

            System.out.println(name + " "+ lastName);
        }
    }
}
