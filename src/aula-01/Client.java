package model;

// Classe Client: representa o cliente que solicita servicos.
// Funcao no dominio: guardar dados basicos do cliente para identificar quem abriu a OS.
// Exemplos de objetos: new Client("Maria", "111.222.333-44", "(62) 99999-0000"),
// new Client("Carlos", "222.333.444-55", "(62) 98888-1111"),
// new Client("Ana", "333.444.555-66", "(62) 97777-2222").
public class Client {
    // Atributo name: nome do cliente, usado em exibicao e identificacao humana.
    String name;
    // Atributo document: documento do cliente, usado como identificador.
    String document;
    // Atributo phone: telefone para contato do cliente.
    String phone;

    // Construtor: cria o objeto Client com os dados iniciais do cliente.
    public Client(String name, String document, String phone) {
        this.name = name;
        this.document = document;
        this.phone = phone;
    }

    // Metodo summary: retorna uma representacao simples do cliente para exibicao.
    public String summary() {
        return name + " (" + document + ")";
    }
}
