package Ex1;

public class TestaVeiculo {

        public static void main(String[] args) {
            Aviao aviao1 = new Aviao("Boeing", "747", 900.0f, 10000.0f);

            CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model S", 120.0f, 400);

            System.out.println("--- Iniciando Testes de Polimorfismo ---");

            Veiculo v;

            v = aviao1;
            System.out.println("Teste com Avião:");
            v.mover();
            v.abastecer();

            System.out.println("---------------------------------------");

            v = carroEletrico;
            System.out.println("Teste com Carro Elétrico:");
            v.mover();
            v.abastecer();
        }
    }
