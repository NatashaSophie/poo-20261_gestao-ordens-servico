// package: declara o pacote (namespace) do arquivo para organizar o projeto.
package app;

// import: permite usar classes de outros pacotes sem escrever o nome completo.
import model.Client;
import model.Equipment;
import model.ServiceOrder;
import model.Technician;

// class: define um tipo em Java; aqui e o ponto de entrada do programa.
public class Main {
    // main: metodo especial que a JVM executa primeiro ao iniciar o programa.
    // String[] args: vetor de argumentos da linha de comando (pode ser usado mais tarde).
    public static void main(String[] args) {
        // Abstracao e dominio: criamos instancias das entidades centrais do dominio.
        // Exemplos de objetos possiveis:
        // - Client: "Maria", "Carlos", "Ana"
        // - Technician: "Joao", "Paula", "Rafael"
        // - Equipment: "Notebook X", "Impressora Y", "Celular Z"
        // new: cria um novo objeto em memoria chamando o construtor da classe.
        // String: tipo de dado para textos; em Java e uma classe imutavel.
        Client client = new Client("Maria", "111.222.333-44", "(62) 99999-0000");
        Technician technician = new Technician("Joao", "555.666.777-88", "Eletronica");
        Equipment equipment = new Equipment("EQP-001", "Notebook X", "TechBrand");

        // ServiceOrder representa o fato do dominio: uma ordem aberta para um equipamento.
        // Exemplos de ordens: "Nao liga", "Tela piscando", "Barulho no cooler".
        ServiceOrder order = new ServiceOrder(1, "Nao liga", "OPEN");

        // System.out.println: imprime texto no console com quebra de linha.
        System.out.println(client.summary());
        System.out.println(technician.summary());
        System.out.println(equipment.summary());
        System.out.println(order.summary());
    }
}
