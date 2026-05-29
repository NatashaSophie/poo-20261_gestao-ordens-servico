// package: declara o pacote (namespace) do arquivo para organizar o projeto.
package app;

// import: permite usar classes de outros pacotes sem escrever o nome completo.
import exception.BusinessException;
import service.ServiceOrderFacade;

// class: define um tipo em Java; aqui e o ponto de entrada do programa.
public class Main {
    // main: metodo especial que a JVM executa primeiro ao iniciar o programa.
    // String[] args: vetor de argumentos da linha de comando (pode ser usado mais tarde).
    public static void main(String[] args) {
        // Facade: centraliza o fluxo do exemplo e deixa a Main mais simples.
        ServiceOrderFacade facade = new ServiceOrderFacade();

        // try/catch: bloco para tratar excecoes e manter o programa controlado.
        try {
            // Executa o exemplo completo do sistema.
            facade.runExample();
        } catch (BusinessException ex) {
            // Excecao de negocio: erro esperado por violacao de regra do dominio.
            System.out.println("Erro de negocio: " + ex.getMessage());
        } catch (Exception ex) {
            // Excecao inesperada: erro nao previsto que precisa ser investigado.
            System.out.println("Erro inesperado: " + ex.getMessage());
        }
    }
}
