package pedrohenrique.pkg00.pkg23;

import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de internações: ");
    int n = scanner.nextInt(); 

    
    Internacao[] internacoes = new Internacao[n];

    
    for (int i = 0; i < n; i++) {
      scanner.nextLine(); // consome o \n deixado pelo nextInt()
      System.out.println("=== Internação " + (i+1) + " ===");

      System.out.print("Data: ");
      String data = scanner.nextLine();

      System.out.print("Motivo: ");
      String motivo = scanner.nextLine();

      System.out.println("Paciente:");
      System.out.print("Nome: ");
      String nomePaciente = scanner.nextLine();
      System.out.print("Idade: ");
      int idadePaciente = scanner.nextInt();
      scanner.nextLine();
      System.out.print("CPF: ");
      String cpfPaciente = scanner.nextLine();
      Paciente paciente = new Paciente(nomePaciente, idadePaciente, cpfPaciente);

      System.out.println("Médico:");
      System.out.print("Nome: ");
      String nomeMedico = scanner.nextLine();
      System.out.print("CRM: ");
      String crmMedico = scanner.nextLine();
      Medico medico = new Medico(nomeMedico, crmMedico);

      System.out.println("Enfermeiro:");
      System.out.print("Nome: ");
      String nomeEnfermeiro = scanner.nextLine();
      Enfermeiro enfermeiro = new Enfermeiro(nomeEnfermeiro);

      System.out.print("ID: ");
      int id = scanner.nextInt();

      System.out.print("Valor diário: ");
      int valorDia = scanner.nextInt();

      System.out.print("Quantidade de dias: ");
      int qtdDias = scanner.nextInt();
      scanner.nextLine(); 

      Internacao internacao = new Internacao(data, motivo, paciente, medico, enfermeiro, id, valorDia, qtdDias);
      internacoes[i] = internacao;
    }

    
    for (int i = 0; i < n; i++) {
      System.out.println("=== Internação " + (i+1) + " ===");
      System.out.println("Data: " + internacoes[i].getData());
      System.out.println("Motivo: " + internacoes[i].getMotivo());
      System.out.println("Paciente: " + internacoes[i].getPaciente1().getNome());
      System.out.println("Médico: " + internacoes[i].getMedico1().getNome());
      System.out.println("Enfermeiro: " + internacoes[i].getEnfermeiro1().getNome());
      System.out.println("ID: " + internacoes[i].getId());
      System.out.println("Valor diário: " + internacoes[i].getValorDia());
      System.out.println (internacoes[i].getQtdDias() + "Quantidade de dias: ");
      
      
    }
  }
}
