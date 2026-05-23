// package: declara o pacote (namespace) do arquivo para organizar o projeto.
package app;

// import: permite usar classes de outros pacotes sem escrever o nome completo.
import model.Customer;
import model.DiagnosticService;
import model.Equipment;
import model.Printable;
import model.RepairService;
import model.ServiceItem;
import model.ServiceOrder;
import model.Technician;

// class: define um tipo em Java; aqui e o ponto de entrada do programa.
public class Main {
    // main: metodo especial que a JVM executa primeiro ao iniciar o programa.
    // String[] args: vetor de argumentos da linha de comando (pode ser usado mais tarde).
    public static void main(String[] args) {
        // Heranca: Customer e Technician reutilizam dados comuns da classe abstrata Person.
        Customer customer = new Customer("Maria", "(62) 99999-0000", "maria@email.com");
        Technician technician = new Technician("Joao", "(62) 98888-1111", "Hardware");

        // Composicao: a ordem de servico agrega cliente, equipamento e tecnico.
        Equipment equipment = new Equipment("Notebook", "TechBrand", "X1000");
        ServiceOrder order = new ServiceOrder(1, "Nao liga", customer, equipment, technician);

        // Polimorfismo: duas subclasses diferentes tratadas como ServiceItem.
        ServiceItem diagnostic = new DiagnosticService("Diagnostico basico", 80.0);
        ServiceItem repair = new RepairService("Troca de conector", 2.5, 120.0);

        System.out.println(diagnostic.showItemInfo());
        System.out.println(repair.showItemInfo());

        order.addItem(diagnostic);
        order.addItem(repair);

        // Interface: Printable define o contrato; ServiceOrder implementa a acao.
        Printable printableOrder = order;
        printableOrder.print();
    }
}
