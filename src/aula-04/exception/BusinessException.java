package exception;

// BusinessException representa falhas de regra de negocio do sistema.
// Ela e usada quando os dados informados violam regras simples do dominio.
// Por ser RuntimeException, nao obriga o uso de throws, mantendo o codigo
// mais didatico para iniciantes e mostrando que nem toda excecao e verificada.
// Assim, conseguimos separar erros de regra (negocio) de erros inesperados.
public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
