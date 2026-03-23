import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args){
        Passageiro pas1 = new Passageiro("1234", "Carlos");
        System.out.println(pas1.toString());

        LocalDateTime data = LocalDateTime.of(2026, 10, 14, 10,15);
        Voo voo1 = new Voo(999, "Guarulhos", "Salvador", data);
        System.out.println(voo1.toString());

        LocalDateTime dataAgora = LocalDateTime.now();

        Reserva reserva1 = new Reserva(12, dataAgora, 1, pas1, voo1);
        System.out.println(reserva1.toString());
    }
}
