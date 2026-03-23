import java.time.LocalDateTime;

public class TestaClinica {
    public static void main(String[] args) {
        Medico medico = new Medico(1, "Dr. João", "Cardiologia");
        Paciente paciente = new Paciente(1, "Maria Silva", "123.456.789-00");
        Consulta consulta = new Consulta(
                LocalDateTime.of(2026, 5, 20, 10, 0),
                250.0,
                medico,
                paciente
        );
        System.out.println(consulta);
    }
}
