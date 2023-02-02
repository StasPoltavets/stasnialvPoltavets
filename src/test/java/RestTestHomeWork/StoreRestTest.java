package RestTestHomeWork;

import RestHomeWork.StoreController;
import RestHomeWork.entities.Store;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.IOException;

public class StoreRestTest {
    @Test
    public void returnPetInventoriesByStatus() throws IOException,NullPointerException {
        StoreController storeController = new StoreController();
        String responseCode = String.valueOf(storeController.returnPetInventoriesByStatus());

        Assert.assertTrue(responseCode.equals("200"));
    }

    @Test
    public void createNewOrderInStore() throws IOException{
        StoreController storeController = new StoreController();
        String responseCode = String.valueOf(storeController.createNewOrder("newOrder"));
        Assert.assertTrue(responseCode.equals("200"));
    }
    @Test
    public void createNewOrderInStoreWithGSON() throws IOException{
        StoreController storeController = new StoreController();

        Store store = new Store();
        store.setId(12);
        store.setPetId(1113);
        store.setQuantity(11);
        store.setShipDate("2023-02-01T07:13:13.341Z");
        store.setStatus("approved");
        store.setComplete(true);

        Store newOrder = storeController.createPetOrderWithGSON(store);

        Assert.assertTrue(store.getComplete(), newOrder.toString());
    }
    @Test
    public void findOrderByID() throws IOException {
        StoreController storeController = new StoreController();
        String responseCode = String.valueOf(storeController.findPurchaseOrderById(11));
        Assert.assertTrue(responseCode.equals("200"));
    }
    @Test
    public  void deleteOrderByID() throws IOException {
        StoreController storeController = new StoreController();
        String responseCode = String.valueOf(storeController.deletePurchaseOrderByID(7));
        Assert.assertTrue(responseCode.equals("200"));
    }
}
