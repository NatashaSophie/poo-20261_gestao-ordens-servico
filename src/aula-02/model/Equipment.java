package model;

// Classe Equipment: representa o equipamento que sera atendido na OS.
// Funcao no dominio: identificar o item fisico que precisa de servico.
// Exemplos de objetos: new Equipment("Notebook", "TechBrand", "X1000"),
// new Equipment("Impressora", "PrintCo", "Pro 200"),
// new Equipment("Celular", "PhoneMax", "Z5").
public class Equipment {
    // Encapsulamento: atributos privados so podem ser acessados por metodos da classe.
    // Isso evita que outras classes alterem os dados sem validacao.
    private String type;
    private String brand;
    private String model;

    // Construtor: cria o objeto Equipment com dados obrigatorios.
    // Usamos setters para aproveitar as validacoes.
    public Equipment(String type, String brand, String model) {
        setType(type);
        setBrand(brand);
        setModel(model);
    }

    // Getter: leitura segura do atributo type.
    public String getType() {
        return type;
    }

    // Setter: valida antes de aceitar o valor.
    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo do equipamento nao pode ser vazio.");
        }
        this.type = type.trim();
    }

    // Getter: leitura segura do atributo brand.
    public String getBrand() {
        return brand;
    }

    // Setter: valida antes de aceitar o valor.
    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Marca do equipamento nao pode ser vazia.");
        }
        this.brand = brand.trim();
    }

    // Getter: leitura segura do atributo model.
    public String getModel() {
        return model;
    }

    // Setter: valida antes de aceitar o valor.
    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo do equipamento nao pode ser vazio.");
        }
        this.model = model.trim();
    }

    // Metodo showEquipmentInfo: resumo simples para exibicao.
    public String showEquipmentInfo() {
        return "Equipamento: " + type + " - " + brand + " " + model;
    }
}
