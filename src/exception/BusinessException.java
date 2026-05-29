package exception;

// BusinessException representa falhas de regra de negocio do sistema.
// Ela e usada quando os dados informados violam regras simples do dominio,
// como nome vazio, numero invalido ou valores negativos que nao fazem sentido.
// Por ser RuntimeException, nao obriga o uso de throws, mantendo o codigo
// mais didatico para iniciantes e mostrando que nem toda excecao e verificada.
// Assim, conseguimos separar erros de regra (negocio) de erros inesperados,
// deixando claro quando o problema e do uso do sistema e nao do programa em si.
public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
