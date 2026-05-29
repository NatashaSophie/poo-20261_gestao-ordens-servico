package model;

// Interface Printable: define um contrato de comportamento para impressao.
// Java nao permite heranca multipla de classes, mas permite varios contratos.
// Assim, uma classe pode herdar de uma superclasse e ainda ser Printable.
public interface Printable {
    void print();
}
