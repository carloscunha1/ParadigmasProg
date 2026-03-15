public class TestaAcademico {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, "Ana Paula", 2023001, "Sistemas de Informação");
        Aluno aluno2 = new Aluno(2, "Carlos Silva", 2023002, "Sistemas de Informação");

        Disciplina disciplina = new Disciplina(10, "Programação Orientada a Objetos", "Prof. João Mendes");

        disciplina.matricularAluno(aluno1);
        disciplina.matricularAluno(aluno2);

        disciplina.criarAvaliacao(1, "Prova Semestral");

        Avaliacao provaSemestral = disciplina.getAvaliacoes().get(0);
        provaSemestral.adicionarQuestao(1, "Explique os pilares de POO", 3.0f);
        provaSemestral.adicionarQuestao(2, "Implemente um exemplo de herança", 3.5f);
        provaSemestral.adicionarQuestao(3, "Diferencie agregação de composição", 3.5f);

        System.out.println(disciplina);
    }
}
