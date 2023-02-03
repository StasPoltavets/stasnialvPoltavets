package rest;

import com.google.gson.Gson;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import rest.entities.Pet;

import java.io.IOException;

public class PetController {
    public void findByStatus(String status) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://petstore3.swagger.io/api/v3/pet/findByStatus?status=" + status)
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
//        System.out.println(response.code());
//        System.out.println(response.body().string());
    }
    public void createNewPet() throws IOException {
        String bodyString = "{\n" +
                "  \"id\": 100010,\n" +
                "  \"name\": \"bingoStringName\",\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Dogs\"\n" +
                "  },\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
        RequestBody body = RequestBody.create(bodyString.getBytes());

        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore3.swagger.io/api/v3/pet/")
                .header("Content-Type", "application/json")
                .build();
        Response response = new OkHttpClient().newCall(request).execute();

//        System.out.println(response.code());
//        System.out.println(response.body().string());

    }

    public void createNewPetWithJson (String patName) throws IOException{
        JSONObject object = new JSONObject();
        object.put("id", "101111");
        object.put("name", patName);
        object.put("status", "available");

        JSONArray tags = new JSONArray();
        tags.put(new JSONObject("{\"id\":1, \"name\":tag1}"));

        object.put("tags", tags);

        RequestBody body = RequestBody.create(object.toString(), MediaType.get("application/json"));

        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore3.swagger.io/api/v3/pet/")
                //.header("Content-Type", "application/json")
                .build();
        Response response = new OkHttpClient().newCall(request).execute();

        //System.out.println(response.code());
        //System.out.println(response.body().string());
        JSONObject responseObject = new JSONObject(response.body().string());
//        System.out.printf("id=%s; name = %s, status = %s",
//                responseObject.get("id"),
//                responseObject.get("name"),
//                responseObject.get("status"));



    }
public void createNewPetWithGSON(Pet pet) throws IOException{
    Gson gson = new Gson();

    RequestBody body = RequestBody.create(gson.toJson(pet), MediaType.get("application/json"));

    Request request = new Request.Builder()
            .post(body)
            .url("https://petstore3.swagger.io/api/v3/pet/")
            //.header("Content-Type", "application/json")
            .build();

    Response response = new OkHttpClient().newCall(request).execute();
    Pet newPet = gson.fromJson(response.body().string(), Pet.class);
    System.out.println(newPet);
}
}
