package app;

import model.Client;
import model.Equipment;
import model.ServiceOrder;
import model.Technician;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Maria", "111.222.333-44", "(62) 99999-0000");
        Technician technician = new Technician("Joao", "555.666.777-88", "Eletronica");
        Equipment equipment = new Equipment("EQP-001", "Notebook X", "TechBrand");

        ServiceOrder order = new ServiceOrder(1, "Nao liga", "OPEN");

        System.out.println(client.summary());
        System.out.println(technician.summary());
        System.out.println(equipment.summary());
        System.out.println(order.summary());
    }
}
