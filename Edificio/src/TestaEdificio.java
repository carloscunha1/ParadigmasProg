public class TestaEdificio {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Edifício Central", "Rua das Flores, 100");
        edificio.construirApartamento(101, 1);
        edificio.construirApartamento(202, 2);
        System.out.println(edificio);
    }
}
