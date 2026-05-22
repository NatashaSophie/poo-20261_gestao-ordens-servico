// package: declara o pacote (namespace) do arquivo para organizar o projeto.
package app;

// import: permite usar classes de outros pacotes sem escrever o nome completo.
import model.Customer;
import model.Equipment;
import model.ServiceOrder;

// class: define um tipo em Java; aqui e o ponto de entrada do programa.
public class Main {
    // main: metodo especial que a JVM executa primeiro ao iniciar o programa.
    // String[] args: vetor de argumentos da linha de comando (pode ser usado mais tarde).
    public static void main(String[] args) {
        // Composicao de objetos: a ordem de servico depende de um cliente e de um equipamento.
        // Cada classe cuida de seus proprios dados (responsabilidade da classe).
        // Ao criar os objetos com construtor, garantimos que eles ja nascem completos.
        Customer customer = new Customer("Maria", "(62) 99999-0000");
        Equipment equipment = new Equipment("Notebook", "TechBrand", "X1000");

        // Construtor com validacoes: evita criar uma ordem inconsistente.
        ServiceOrder order = new ServiceOrder(1, "Nao liga", 250.0, customer, equipment);

        // Encapsulamento: acessamos os dados via metodos publicos, nao pelos atributos.
        System.out.println(order.showOrderSummary());

        // Composicao de metodos: um metodo da classe altera o estado da propria classe.
        order.finishOrder();

        // Estado atualizado apos o metodo terminar a OS.
        System.out.println(order.showOrderSummary());
    }
}
