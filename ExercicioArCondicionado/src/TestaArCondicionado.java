public class TestaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado obj1 = new ArCondicionado();
        System.out.println("Ar Condicionado 1: " + obj1.toString());

        ArCondicionado obj2 = new ArCondicionado("Samsung", "Inverter", 12, true);
        System.out.println("Ar Condicionado 2: " + obj2.toString());

        ArCondicionado obj3 = new ArCondicionado("Samsung", "Inverter", 26, true);
        System.out.println("Ar Condicionado 3: " + obj3.toString());
        obj3.ligarModoTurbo();
        System.out.println("Ar Condicionado 3: " + obj3.toString());
    }
}
