package pedrohenrique.pkg00.pkg23;

import java.util.ArrayList;


public class Paciente {
    private String nome;
    private String cpf;
    private int idade; 
    private Medico m1;
    private Enfermeiro e1;
    private ArrayList<Internacao> internacao1;
    

    Paciente(String nomePaciente, int idadePaciente, String cpfPaciente) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void visualizarinternações() {
        System.out.println("Cliente: " + nome);
        System.out.println("Medico: " + m1.getNome());
        System.out.println("Enfermeiro: " + e1.getNome());
        System.out.println("Internações:");
        for (Internacao internacao : internacao1) {
            System.out.println("ID: " + internacao.getId());
            System.out.println("Valor do dia: " + internacao.getValorDia()+ " Quantidade de dias: " + internacao.getQtdDias());
            System.out.println("Motivo: " + internacao.getMotivo());
            System.out.println("Valor total da internacao: " + internacao.getQtdDias()* internacao.getValorDia());
        }
    
    
    }
}
