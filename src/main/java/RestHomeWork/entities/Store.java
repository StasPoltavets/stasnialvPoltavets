package RestHomeWork.entities;

import lombok.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Data
public class Store {

    private Integer id;
    private Integer petId;
    private Integer quantity;
    private String shipDate;
    private String status;
    private Boolean complete;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(petId, store.petId) && Objects.equals(quantity, store.quantity) && Objects.equals(shipDate, store.shipDate) && Objects.equals(status, store.status) && Objects.equals(complete, store.complete) && Objects.equals(additionalProperties, store.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, petId, quantity, shipDate, status, complete, additionalProperties);
    }
}