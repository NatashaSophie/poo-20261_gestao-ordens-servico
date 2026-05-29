package model;

// Classe ServiceOrder: representa a ordem de servico aberta para um atendimento.
// Funcao no dominio: registrar a necessidade do cliente e o estado do atendimento.
// Exemplos de objetos: new ServiceOrder(1, "Nao liga", 250.0, customer, equipment).
public class ServiceOrder {
    // Encapsulamento: atributos privados preservam o controle da classe.
    // A classe e responsavel por manter regras simples do dominio.
    private int number;
    private String description;
    private double estimatedValue;
    private String status;
    private Customer customer;
    private Equipment equipment;

    // Construtor: cria a OS com dados essenciais.
    // A composicao aparece aqui: a OS possui um cliente e um equipamento.
    public ServiceOrder(int number, String description, double estimatedValue,
            Customer customer, Equipment equipment) {
        setNumber(number);
        setDescription(description);
        setEstimatedValue(estimatedValue);
        setCustomer(customer);
        setEquipment(equipment);
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
            throw new IllegalArgumentException("Numero da OS deve ser maior que zero.");
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
            throw new IllegalArgumentException("Descricao nao pode ser vazia.");
        }
        this.description = description.trim();
    }

    // Getter do valor estimado.
    public double getEstimatedValue() {
        return estimatedValue;
    }

    // Setter com validacao simples.
    public void setEstimatedValue(double estimatedValue) {
        if (estimatedValue < 0) {
            throw new IllegalArgumentException("Valor estimado nao pode ser negativo.");
        }
        this.estimatedValue = estimatedValue;
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
            throw new IllegalArgumentException("Cliente nao pode ser nulo.");
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
            throw new IllegalArgumentException("Equipamento nao pode ser nulo.");
        }
        this.equipment = equipment;
    }

    // Metodo finishOrder: muda o estado da OS de forma controlada.
    public void finishOrder() {
        this.status = "Finalizada";
    }

    // Metodo showOrderSummary: resumo completo da OS para exibicao.
    // Composicao de metodos: usamos metodos do cliente e do equipamento.
    public String showOrderSummary() {
        return "OS #" + number + " - " + description
                + " | Valor estimado: R$ " + estimatedValue
                + " | Status: " + status
                + "\n" + customer.showCustomerInfo()
                + "\n" + equipment.showEquipmentInfo();
    }
}
