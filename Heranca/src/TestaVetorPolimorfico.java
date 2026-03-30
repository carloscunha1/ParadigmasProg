public class TestaVetorPolimorfico {
    public static void main(String[] args){

        // criar objeto Junior
        Junior jr1 = new Junior("Fulano", "Java", 4000, "Beltrano");

        // criar objeto Pleno
        Pleno pln1 = new Pleno("Beltrano", "Java", 5000, 5);

        // criar objeto Sênior
        Senior snr1 = new Senior("Ciclano", "Java", 6000, 3000);

        // criar objeto Sênior
        Desenvolvedor dev1 = new Desenvolvedor("Duardo", "Java", 6000);

        Desenvolvedor[] desenvolvedores = new Desenvolvedor[4];

        desenvolvedores[0] = jr1;
        desenvolvedores[1] = pln1;
        desenvolvedores[2] = snr1;
        desenvolvedores[3] = dev1;

        for (int i = 0; i < desenvolvedores.length; i++) {
            System.out.println("Posição " + i + ": " + desenvolvedores[i].getNome());
            System.out.println("Salário: " + desenvolvedores[i].getSalario());

            System.out.println("Bônus: " + desenvolvedores[i].calcularBonus());
            System.out.println("------------------------------------");
        }
    }
}
