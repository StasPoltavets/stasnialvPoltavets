package RestHomeWork;

import RestHomeWork.entities.Store;
import com.google.gson.Gson;
import okhttp3.*;
import org.json.JSONObject;


import java.io.IOException;

public class StoreController {
    public int returnPetInventoriesByStatus() throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://petstore3.swagger.io/api/v3/store/inventory")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());
        System.out.println(response.headers().toString());
        return response.code();
    }
    public Store createPetOrderWithGSON(Store store) throws  IOException{
        Gson gson = new Gson();

        RequestBody body = RequestBody.create(gson.toJson(store), MediaType.parse("application/json"));

        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore3.swagger.io/api/v3/store/order")
                .build();
        Response response = new OkHttpClient().newCall(request).execute();
        Store newOrder = gson.fromJson(response.body().string(), Store.class);

        System.out.println(newOrder);
        System.out.println(response.headers().toString());
        return newOrder;
    }
    public int createNewOrder(String newOrder) throws IOException {
        JSONObject  jsonObject = new JSONObject();

        jsonObject.put ("id", 11);
        jsonObject.put("petId", 1110);
        jsonObject.put("quantity", 9);
        jsonObject.put("shipDate", "2023-02-02T07:13:13.341Z");
        jsonObject.put("status", "approved");
        jsonObject.put("complete", true);

        RequestBody body = RequestBody.create(jsonObject.toString(), MediaType.parse("application/json"));

        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore3.swagger.io/api/v3/store/order")
                .build();
        Response response = new OkHttpClient().newCall(request).execute();

        JSONObject responseObject = new JSONObject(response.body().string());

        System.out.println(response.code());
        System.out.printf("id=%d; petId=%d, quantity=%d, status=%s",
                responseObject.get("id"),
                responseObject.get("petId"),
                responseObject.get("quantity"),
                responseObject.get("status"));
        System.out.println(response.headers().toString());
        return response.code();
    }

    public int findPurchaseOrderById(int id) throws  IOException{
        Request request = new Request.Builder()
                .get()
                .url("https://petstore3.swagger.io/api/v3/store/order/" + id)
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());
        System.out.println(response.headers().toString());
        return response.code();
    }

    public int deletePurchaseOrderByID(int orderID) throws  IOException{
        Gson gson = new Gson();

        RequestBody body = RequestBody.create(gson.toJson(orderID), MediaType.parse("application/json"));

        Request request = new Request.Builder()
                .delete(body)
                .url("https://petstore3.swagger.io/api/v3/store/order/5")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());
        System.out.println(response.headers().toString());
        return response.code();
    }
}