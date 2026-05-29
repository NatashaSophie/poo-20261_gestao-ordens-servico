package model;

import exception.BusinessException;

// Classe ServiceOrder: representa a ordem de servico aberta para um atendimento.
// Funcao no dominio: registrar a necessidade do cliente e o estado do atendimento.
// A classe usa composicao: possui cliente, equipamento e tecnico como partes do todo.
public class ServiceOrder implements Printable {
    // Encapsulamento: atributos privados preservam o controle da classe.
    // A classe e responsavel por manter regras simples do dominio.
    private int number;
    private String description;
    private String status;
    private Customer customer;
    private Equipment equipment;
    private Technician technician;
    private java.util.List<ServiceItem> items;

    // Construtor: cria a OS com dados essenciais.
    // A composicao aparece aqui: a OS possui cliente, equipamento e tecnico.
    public ServiceOrder(int number, String description,
            Customer customer, Equipment equipment, Technician technician) {
        setNumber(number);
        setDescription(description);
        setCustomer(customer);
        setEquipment(equipment);
        setTechnician(technician);
        this.items = new java.util.ArrayList<>();
        // Status inicial definido pela propria classe (responsabilidade).
        this.status = "Aberta";
    }

    // Getter do numero.
    public int getNumber() {
        return number;
    }

    // Setter com validacao simples.
    public void setNumber(int number) {
        if (number <= 0) {
            throw new BusinessException("Numero da OS deve ser maior que zero.");
        }
        this.number = number;
    }

    // Getter da descricao.
    public String getDescription() {
        return description;
    }

    // Setter com validacao simples.
    public void setDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new BusinessException("Descricao nao pode ser vazia.");
        }
        this.description = description.trim();
    }

    // Getter do status.
    public String getStatus() {
        return status;
    }

    // Getter do cliente.
    public Customer getCustomer() {
        return customer;
    }

    // Setter com validacao simples.
    public void setCustomer(Customer customer) {
        if (customer == null) {
            throw new BusinessException("Cliente nao pode ser nulo.");
        }
        this.customer = customer;
    }

    // Getter do equipamento.
    public Equipment getEquipment() {
        return equipment;
    }

    // Setter com validacao simples.
    public void setEquipment(Equipment equipment) {
        if (equipment == null) {
            throw new BusinessException("Equipamento nao pode ser nulo.");
        }
        this.equipment = equipment;
    }

    // Getter do tecnico.
    public Technician getTechnician() {
        return technician;
    }

    // Setter com validacao simples.
    public void setTechnician(Technician technician) {
        if (technician == null) {
            throw new BusinessException("Tecnico nao pode ser nulo.");
        }
        this.technician = technician;
    }

    public java.util.List<ServiceItem> getItems() {
        return java.util.Collections.unmodifiableList(items);
    }

    public void addItem(ServiceItem item) {
        if (item == null) {
            throw new BusinessException("Item de servico nao pode ser nulo.");
        }
        items.add(item);
    }

    public void removeItem(ServiceItem item) {
        if (item == null) {
            throw new BusinessException("Item de servico nao pode ser nulo.");
        }
        items.remove(item);
    }

    public double getTotalValue() {
        double total = 0.0;
        for (ServiceItem item : items) {
            total += item.calculateValue();
        }
        return total;
    }

    // Metodo finishOrder: muda o estado da OS de forma controlada.
    public void finishOrder() {
        this.status = "Finalizada";
    }

    // Metodo showOrderSummary: resumo completo da OS para exibicao.
    // Composicao de metodos: usamos metodos do cliente, equipamento e tecnico.
    public String showOrderSummary() {
        StringBuilder summary = new StringBuilder();
        summary.append("OS #").append(number).append(" - ").append(description)
                .append(" | Status: ").append(status)
                .append("\n").append(customer.showInfo())
                .append("\n").append(equipment.showEquipmentInfo())
                .append("\n").append(technician.showInfo());

        if (!items.isEmpty()) {
            summary.append("\nItens de servico:");
            for (ServiceItem item : items) {
                summary.append("\n- ").append(item.showItemInfo());
            }
            summary.append("\nTotal: R$ ").append(getTotalValue());
        }

        return summary.toString();
    }

    // Implementacao do contrato da interface Printable.
    // A interface define o comportamento e a classe fornece a acao concreta.
    @Override
    public void print() {
        System.out.println(showOrderSummary());
    }
}
