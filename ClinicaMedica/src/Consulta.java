import java.time.LocalDateTime;

public class Consulta {
    private LocalDateTime data;
    private double valorDaConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta(LocalDateTime data, double valorDaConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        this.valorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDateTime getData() { return data; }
    public double getValorDaConsulta() { return valorDaConsulta; }
    public Medico getMedico() { return medico; }
    public Paciente getPaciente() { return paciente; }

    @Override
    public String toString() {
        return "Consulta em " + data + ", valor: R$" + valorDaConsulta + ", " + medico + ", " + paciente;
    }
}
