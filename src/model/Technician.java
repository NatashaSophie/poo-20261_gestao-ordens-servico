package model;

import exception.BusinessException;

// Technician especializa Person com dados de atuacao tecnica.
// A subclasse reaproveita nome e telefone e adiciona a especialidade.
public class Technician extends Person {
    private String specialty;

    public Technician(String name, String phone, String specialty) {
        super(name, phone);
        setSpecialty(specialty);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        if (specialty == null || specialty.trim().isEmpty()) {
            throw new BusinessException("Especialidade do tecnico nao pode ser vazia.");
        }
        this.specialty = specialty.trim();
    }

    @Override
    public String showInfo() {
        return "Tecnico: " + getName() + " | Fone: " + getPhone() + " | Especialidade: " + specialty;
    }
}
