public class Pleno extends Desenvolvedor{
    private int projEntr; //qtde de projetos entregues

    public Pleno() {
        super();
    }

    public Pleno(String nome, String linguagem, float salario, int projEntr) {
        super(nome, linguagem, salario);
        this.projEntr = projEntr;
    }

    public int getProjEntr() {
        return projEntr;
    }

    public void setProjEntr(int projEntr) {
        this.projEntr = projEntr;
    }

    @Override
    public void codar(){
        System.out.println("Pleno desenvolvendo código e fazendo code review");
    }

    @Override
    public float calcularBonus(){
        return super.calcularBonus() + 2000;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                "projEntr=" + projEntr +
                ", nome='" + nome + '\'' +
                ", linguagem='" + linguagem + '\'' +
                ", salario=" + salario +
                '}';
    }
}
