package model;

import exception.BusinessException;

// Classe abstrata Person: generaliza dados comuns de pessoas no dominio.
// Ela nao pode ser instanciada diretamente e serve como base para reutilizacao.
// Ao centralizar nome e telefone aqui, evitamos duplicacao em Customer e Technician.
// Cada subclasse especializa o comportamento ao sobrescrever o metodo showInfo().
public abstract class Person {
    // Encapsulamento: atributos privados com validacao nos setters.
    private String name;
    private String phone;

    // Construtor protegido por validacao: toda pessoa nasce com dados obrigatorios.
    public Person(String name, String phone) {
        setName(name);
        setPhone(phone);
    }

    // Getter do nome.
    public String getName() {
        return name;
    }

    // Setter com validacao para evitar nome nulo ou vazio.
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new BusinessException("Nome nao pode ser vazio.");
        }
        this.name = name.trim();
    }

    // Getter do telefone.
    public String getPhone() {
        return phone;
    }

    // Setter com validacao para evitar telefone nulo ou vazio.
    public void setPhone(String phone) {
        if (phone == null || phone.trim().isEmpty()) {
            throw new BusinessException("Telefone nao pode ser vazio.");
        }
        this.phone = phone.trim();
    }

    // Metodo abstrato: cada subclasse decide como exibir suas informacoes.
    public abstract String showInfo();
}
