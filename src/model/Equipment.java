package model;

// Classe Equipment: representa o equipamento que sera atendido na OS.
// Funcao no dominio: identificar o item fisico que precisa de servico.
// Exemplos de objetos: new Equipment("EQP-001", "Notebook X", "TechBrand"),
// new Equipment("EQP-002", "Impressora Y", "PrintCo"),
// new Equipment("EQP-003", "Celular Z", "PhoneMax").
public class Equipment {
    // Atributo serialNumber: numero de serie, usado para identificar unicamente.
    String serialNumber;
    // Atributo model: modelo do equipamento, usado para descricao.
    String model;
    // Atributo brand: marca do equipamento, usada para descricao.
    String brand;

    // Construtor: cria o objeto Equipment com seus dados basicos.
    public Equipment(String serialNumber, String model, String brand) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.brand = brand;
    }

    // Metodo summary: retorna uma representacao simples do equipamento.
    public String summary() {
        return brand + " " + model + " (" + serialNumber + ")";
    }
}
