public class TestaDesenvolvedor{
    public static void main(String[] args){

        // criar objeto Junior
        Junior jr1 = new Junior("Fulano", "Java", 4000, "Beltrano");
        jr1.codar();
        System.out.println(jr1.toString() + "Bônis " + jr1.calcularBonus());

        // criar objeto Pleno
        Pleno pln1 = new Pleno("Beltrano", "Java", 5000, 5);
        pln1.codar();
        System.out.println(pln1.toString() + "Bônis " + pln1.calcularBonus());

        // criar objeto Sênior
        Senior snr1 = new Senior("Ciclano", "Java", 6000, 3000);
        snr1.codar();
        System.out.println(snr1.toString() + "Bônis " + snr1.calcularBonus());

    }
}
