package model;

// Classe ServiceOrder: representa a ordem de servico aberta para um atendimento.
// Funcao no dominio: registrar a necessidade do cliente e o estado do atendimento.
// Exemplos de objetos: new ServiceOrder(1, "Nao liga", "OPEN"),
// new ServiceOrder(2, "Tela piscando", "OPEN"),
// new ServiceOrder(3, "Barulho no cooler", "IN_PROGRESS").
public class ServiceOrder {
    // Atributo id: identificador numerico da OS.
    int id;
    // Atributo description: descricao do problema relatado pelo cliente.
    String description;
    // Atributo status: situacao atual da OS (OPEN, IN_PROGRESS, DONE).
    String status;

    // Construtor: cria a OS com id, descricao e status iniciais.
    public ServiceOrder(int id, String description, String status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    // Metodo summary: retorna uma representacao simples da OS para exibicao.
    public String summary() {
        return "OS #" + id + " - " + description + " [" + status + "]";
    }
}
