package pedrohenrique.pkg00.pkg23;
import java.util.Random;

public class Internacao {
    private String data;
    private String motivo;
    private Paciente paciente1;
    private Medico medico1;
    private Enfermeiro enfermeiro1;
    private int id;
    private double valorDia;
    private int qtdDias;
    private double valorTotal;

    public Internacao(String data, String motivo, Paciente paciente, Medico medico, Enfermeiro enfermeiro, int id, int valorDia, int qtdDias) {
        Random random = new Random();
        this.data = data;
        this.motivo = motivo;
        this.paciente1 = paciente1;
        this.medico1 = medico1;
        this.enfermeiro1 = enfermeiro1;
        this.valorDia = valorDia;
        this.qtdDias = qtdDias;
        this.id = random.nextInt();
        this.valorTotal = this.valorDia * this.qtdDias;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Paciente getPaciente1() {
        return paciente1;
    }

    public void setPaciente1(Paciente paciente1) {
        this.paciente1 = paciente1;
    }

    public Medico getMedico1() {
        return medico1;
    }

    public void setMedico1(Medico medico1) {
        this.medico1 = medico1;
    }

    public Enfermeiro getEnfermeiro1() {
        return enfermeiro1;
    }

    public void setEnfermeiro1(Enfermeiro enfermeiro1) {
        this.enfermeiro1 = enfermeiro1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
}
