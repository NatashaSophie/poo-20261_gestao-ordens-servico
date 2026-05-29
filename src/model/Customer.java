package model;

import exception.BusinessException;

// Customer herda de Person (superclasse) e se torna uma subclasse especializada.
// A heranca reaproveita nome e telefone, evitando duplicacao de codigo.
// O construtor usa super() para inicializar a parte herdada do objeto.
public class Customer extends Person {
    private String email;

    public Customer(String name, String phone, String email) {
        super(name, phone);
        setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new BusinessException("Email do cliente nao pode ser vazio.");
        }
        this.email = email.trim();
    }

    // Sobrescrita: cada subclasse define como mostrar suas informacoes.
    @Override
    public String showInfo() {
        return "Cliente: " + getName() + " | Fone: " + getPhone() + " | Email: " + email;
    }
}
