public class Senior extends Desenvolvedor{
    private float verbaLideranca;

    public Senior(float verbaLideranca) {
        super();
    }

    public Senior(String nome, String linguagem, float salario, float verbaLideranca) {
        super(nome, linguagem, salario);
        this.verbaLideranca = verbaLideranca;
    }

    public float getVerbaLideranca() {
        return verbaLideranca;
    }

    public void setVerbaLideranca(float verbaLideranca) {
        this.verbaLideranca = verbaLideranca;
    }

    @Override
    public void codar(){
        System.out.println("Sênior desenhando arquitetura e orientando a equipe");
    }

    @Override
    public float calcularBonus(){
        return super.calcularBonus() + 4000;
    }

    @Override
    public String toString() {
        return "Senior{" +
                "verbaLideranca=" + verbaLideranca +
                ", nome='" + nome + '\'' +
                ", linguagem='" + linguagem + '\'' +
                ", salario=" + salario +
                '}';
    }
}
