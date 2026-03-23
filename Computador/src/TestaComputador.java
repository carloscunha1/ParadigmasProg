public class TestaComputador {
    public static void main(String[] args) {
        Computador comp = new Computador(1, "Dell", "Intel", "i7-12700H", 2.9);
        System.out.println(comp);
        // Se comp for anulado, processador também deixa de existir
        comp = null;
        System.out.println("Computador deletado. O processador também deixa de existir.");
    }
}
