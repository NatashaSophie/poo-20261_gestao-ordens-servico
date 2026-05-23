package model;

// Classe abstrata ServiceItem: representa um item de servico generico.
// Diferentes tipos de servico podem calcular valores de formas distintas.
// O metodo calculateValue() e abstrato para forcar cada subclasse a definir sua regra.
public abstract class ServiceItem {
    private String description;

    public ServiceItem(String description) {
        setDescription(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Descricao do servico nao pode ser vazia.");
        }
        this.description = description.trim();
    }

    // Cada servico calcula seu valor de maneira propria.
    public abstract double calculateValue();

    // Metodo comum para exibir informacoes, reaproveitando a logica de calculo.
    public String showItemInfo() {
        return "Servico: " + description + " | Valor: R$ " + calculateValue();
    }
}
