public class TestaDrone {
    public static void main(String[] args) {
        Drone obj1 = new Drone();
        System.out.println("Drone 1 (Vazio): " + obj1.toString());

        Drone obj2 = new Drone("DJI-P4", 0.0f, 100, false);
        System.out.println("Drone 2 (Antes): " + obj2.toString());
        obj2.decolar();
        System.out.println("Drone 2 (Após Decolar): " + obj2.toString());

        Drone obj3 = new Drone("SKY-NET", 10.0f, 80, true);
        System.out.println("Drone 3 (Status Inicial): " + obj3.toString());

        obj3.subir(20);
        System.out.println("Drone 3 (Após Subir 20m): " + obj3.toString());

        obj3.descer(5);
        System.out.println("Drone 3 (Após Descer 5m): " + obj3.toString());
    }
}