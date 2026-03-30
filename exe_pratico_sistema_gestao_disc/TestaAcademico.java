public class TestaAcademico {
    public static void main(String[] args) {

        // 1. instanciar 2 alunos independentes
        Aluno a1 = new Aluno(1, "Joao Silva", "2024001", "Engenharia de Software");
        Aluno a2 = new Aluno(2, "Maria Souza", "2024002", "Engenharia de Software");

        System.out.println("Alunos criados:");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println();

        // 2. instanciar disciplina
        Disciplina poo = new Disciplina(101, "Programacao Orientada a Objetos", "Prof. Alexandre");
        System.out.println();

        // 3. agregacao - matricular os alunos
        poo.matricularAluno(a1);
        poo.matricularAluno(a2);
        System.out.println();

        // 4. composicao - criar avaliacao dentro da disciplina
        poo.criarAvaliacao(1, "Prova Semestral");
        System.out.println();

        // 5. composicao aninhada - adicionar questoes na avaliacao
        poo.getAvaliacoes().get(0).adicionarQuestao(1, "Explique o conceito de encapsulamento.", 3.0f);
        poo.getAvaliacoes().get(0).adicionarQuestao(2, "Qual a diferenca entre agregacao e composicao?", 3.5f);
        poo.getAvaliacoes().get(0).adicionarQuestao(3, "Implemente uma classe com heranca.", 3.5f);
        System.out.println();

        // 6. imprimir toda a arvore de objetos
        System.out.println(poo.toString());
    }
}
