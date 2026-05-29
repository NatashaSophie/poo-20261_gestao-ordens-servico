package service;

import model.Customer;
import model.DiagnosticService;
import model.Equipment;
import model.Printable;
import model.RepairService;
import model.ServiceItem;
import model.ServiceOrder;
import model.Technician;

// Facade: centraliza a execucao do exemplo principal do sistema.
// Essa classe reduz a responsabilidade da Main, deixando o ponto de entrada
// mais limpo e focado apenas em iniciar o caso de uso.
public class ServiceOrderFacade {
    // Metodo que executa o fluxo completo do exemplo didatico.
    public void runExample() {
        // Criacao dos objetos principais do dominio (clientes, tecnico e equipamento).
        Customer customer = new Customer("Maria", "(62) 99999-0000", "maria@email.com");
        Technician technician = new Technician("Joao", "(62) 98888-1111", "Hardware");
        Equipment equipment = new Equipment("Notebook", "TechBrand", "X1000");

        // Composicao: a ordem de servico agrega cliente, equipamento e tecnico.
        ServiceOrder order = new ServiceOrder(1, "Nao liga", customer, equipment, technician);

        // Polimorfismo: diferentes tipos de servico tratados pela superclasse ServiceItem.
        ServiceItem diagnostic = new DiagnosticService("Diagnostico basico", 80.0);
        ServiceItem repair = new RepairService("Troca de conector", 2.5, 120.0);

        // Exibicao dos itens de servico (cada um calcula seu valor de forma distinta).
        System.out.println(diagnostic.showItemInfo());
        System.out.println(repair.showItemInfo());

        order.addItem(diagnostic);
        order.addItem(repair);

        // Interface: Printable define o contrato; ServiceOrder fornece a acao concreta.
        Printable printableOrder = order;
        printableOrder.print();

        // Finalizacao da OS e nova exibicao para mostrar a mudanca de estado.
        order.finishOrder();
        printableOrder.print();
    }
}
