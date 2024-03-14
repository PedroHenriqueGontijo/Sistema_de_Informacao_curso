package pedrohenrique.ph00.pkg23;

public class Enfermeiro {
    private String nome;
    private String setor;
    private String cpf;

    public Enfermeiro(String nome) {
        this.nome = nome;
        this.setor = "";
        this.cpf = "";
    }

    Enfermeiro(String nomeEnfermeiro, String corenEnfermeiro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
