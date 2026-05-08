package model;

public class Client {
    // Representa o cliente que solicita um servico.
    String name;
    String document;
    String phone;

    public Client(String name, String document, String phone) {
        this.name = name;
        this.document = document;
        this.phone = phone;
    }

    public String summary() {
        return name + " (" + document + ")";
    }
}
