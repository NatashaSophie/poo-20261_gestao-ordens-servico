package model;

public class ServiceOrder {
    // Representa a ordem de servico aberta pelo cliente.
    int id;
    String description;
    String status;

    public ServiceOrder(int id, String description, String status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public String summary() {
        return "OS #" + id + " - " + description + " [" + status + "]";
    }
}
