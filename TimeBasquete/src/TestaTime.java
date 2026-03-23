public class TestaTime {
    public static void main(String[] args) {
        Atleta atleta = new Atleta(1, "Lucas", "Armador");
        Time time = new Time(1, "Franca Basquete", "Helinho");
        time.contratarAtleta(atleta);
        System.out.println(time);
        // Anulando o time
        time = null;
        System.out.println("Atleta ainda existe: " + atleta);
    }
}
