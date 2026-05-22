package model;

// Classe Customer: representa o cliente que abre a ordem de servico.
// Responsabilidade da classe: guardar dados basicos do cliente de forma valida.
public class Customer {
    // Encapsulamento: atributos privados impedem acesso direto de outras classes.
    // Assim, toda alteracao passa por validacoes nos setters.
    private String name;
    private String phone;

    // Construtor: cria o cliente com informacoes obrigatorias.
    // Ao usar o construtor, garantimos que o objeto nasce consistente.
    public Customer(String name, String phone) {
        setName(name);
        setPhone(phone);
    }

    // Getter: permite consultar o nome sem expor o atributo diretamente.
    public String getName() {
        return name;
    }

    // Setter: valida o dado antes de salvar.
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente nao pode ser vazio.");
        }
        this.name = name.trim();
    }

    // Getter: permite consultar o telefone sem expor o atributo diretamente.
    public String getPhone() {
        return phone;
    }

    // Setter: valida o dado antes de salvar.
    public void setPhone(String phone) {
        if (phone == null || phone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone do cliente nao pode ser vazio.");
        }
        this.phone = phone.trim();
    }

    // Metodo showCustomerInfo: retorna um resumo simples para exibicao.
    public String showCustomerInfo() {
        return "Cliente: " + name + " | Fone: " + phone;
    }
}
