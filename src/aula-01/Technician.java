package model;

// Classe Technician: representa o tecnico responsavel pela execucao do servico.
// Funcao no dominio: registrar quem vai atender a OS e sua especialidade.
// Exemplos de objetos: new Technician("Joao", "555.666.777-88", "Eletronica"),
// new Technician("Paula", "666.777.888-99", "Informatica"),
// new Technician("Rafael", "777.888.999-00", "Hardware").
public class Technician {
    // Atributo name: nome do tecnico, usado em exibicao e identificacao humana.
    String name;
    // Atributo document: documento do tecnico, usado como identificador.
    String document;
    // Atributo specialty: area de atuacao do tecnico.
    String specialty;

    // Construtor: cria o objeto Technician com seus dados basicos.
    public Technician(String name, String document, String specialty) {
        this.name = name;
        this.document = document;
        this.specialty = specialty;
    }

    // Metodo summary: retorna uma representacao simples do tecnico para exibicao.
    public String summary() {
        return name + " (" + specialty + ")";
    }
}