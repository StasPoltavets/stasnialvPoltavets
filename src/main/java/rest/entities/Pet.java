package rest.entities;

public class Pet {
    private long id;
    private String name;
    private String status;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString(){
        return "Pet{" + "id=" +id+ ", name'" +name+ '\'' + ", status='" + status+ '\''+'}';
    }

}
