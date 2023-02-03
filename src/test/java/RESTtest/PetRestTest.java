package RESTtest;

import okhttp3.Request;
import org.testng.annotations.Test;
import rest.PetController;
import rest.entities.Pet;

import java.io.IOException;

public class PetRestTest {

    @Test
    public void petRestTest () throws IOException {
        PetController petController = new PetController();
        petController.findByStatus("available");


    }
    @Test
    public void createPetRestTest () throws IOException {
        PetController petController = new PetController();
        petController.findByStatus("available");

        petController.createNewPet();
    }
    @Test
    public void create2PetRestTest () throws IOException {
        PetController petController = new PetController();

        Pet pet = new Pet();
        pet.setId(121212);
        pet.setName("GsonePetNew");
        pet.setStatus("pending");
        petController.createNewPetWithGSON(pet);

    }


    }
