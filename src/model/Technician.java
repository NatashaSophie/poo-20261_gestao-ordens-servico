package model;

public class Technician {
    // Representa o tecnico responsavel pela execucao do servico.
    String name;
    String document;
    String specialty;

    public Technician(String name, String document, String specialty) {
        this.name = name;
        this.document = document;
        this.specialty = specialty;
    }

    public String summary() {
        return name + " (" + specialty + ")";
    }
}
