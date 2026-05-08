package model;

public class Equipment {
    // Representa o equipamento que sera atendido.
    String serialNumber;
    String model;
    String brand;

    public Equipment(String serialNumber, String model, String brand) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.brand = brand;
    }

    public String summary() {
        return brand + " " + model + " (" + serialNumber + ")";
    }
}
