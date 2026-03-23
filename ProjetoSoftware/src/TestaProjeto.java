public class TestaProjeto {
    public static void main(String[] args) {
        Projeto projeto = new Projeto(1, "Sistema de Vendas");
        Programador p1 = new Programador(1, "Ana", "Java");
        Programador p2 = new Programador(2, "Bruno", "Python");
        projeto.adicionarProgramador(p1);
        projeto.adicionarProgramador(p2);
        projeto.listarProgramadores();
    }
}
