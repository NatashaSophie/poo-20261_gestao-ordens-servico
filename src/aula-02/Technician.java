package model;

// Classe Technician: representa o tecnico responsavel pela execucao do servico.
// Responsabilidade da classe: manter dados basicos do tecnico de forma valida.
public class Technician {
    // Encapsulamento: atributos privados evitam alteracao direta sem validacao.
    private String name;
    private String document;
    private String specialty;

    // Construtor: cria o tecnico com informacoes obrigatorias.
    // Assim, o objeto ja nasce consistente para uso futuro.
    public Technician(String name, String document, String specialty) {
        setName(name);
        setDocument(document);
        setSpecialty(specialty);
    }

    // Getter: leitura segura do nome.
    public String getName() {
        return name;
    }

    // Setter: valida antes de aceitar o valor.
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do tecnico nao pode ser vazio.");
        }
        this.name = name.trim();
    }

    // Getter: leitura segura do documento.
    public String getDocument() {
        return document;
    }

    // Setter: valida antes de aceitar o valor.
    public void setDocument(String document) {
        if (document == null || document.trim().isEmpty()) {
            throw new IllegalArgumentException("Documento do tecnico nao pode ser vazio.");
        }
        this.document = document.trim();
    }

    // Getter: leitura segura da especialidade.
    public String getSpecialty() {
        return specialty;
    }

    // Setter: valida antes de aceitar o valor.
    public void setSpecialty(String specialty) {
        if (specialty == null || specialty.trim().isEmpty()) {
            throw new IllegalArgumentException("Especialidade do tecnico nao pode ser vazia.");
        }
        this.specialty = specialty.trim();
    }

    // Metodo showTechnicianInfo: resumo simples para exibicao.
    public String showTechnicianInfo() {
        return "Tecnico: " + name + " | Especialidade: " + specialty;
    }
}
