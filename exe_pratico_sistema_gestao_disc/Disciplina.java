import java.util.ArrayList;

public class Disciplina {

    private int id;
    private String nome;
    private String professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    // construtor
    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<Aluno>();
        this.avaliacoes = new ArrayList<Avaliacao>();
    }

    // getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    // AGREGACAO - o aluno ja existe fora, so vincula
    public void matricularAluno(Aluno a) {
        alunos.add(a);
        System.out.println("Aluno " + a.getNome() + " matriculado na disciplina " + nome);
    }

    // COMPOSICAO - a avaliacao nasce dentro da disciplina
    public void criarAvaliacao(int id, String nome) {
        Avaliacao av = new Avaliacao(id, nome);
        avaliacoes.add(av);
        System.out.println("Avaliacao '" + nome + "' criada na disciplina " + this.nome);
    }

    public String toString() {
        String resultado = "========== DISCIPLINA ==========\n";
        resultado = resultado + "ID: " + id + "\n";
        resultado = resultado + "Nome: " + nome + "\n";
        resultado = resultado + "Professor: " + professor + "\n";

        resultado = resultado + "\n--- Alunos Matriculados ---\n";
        for (int i = 0; i < alunos.size(); i++) {
            resultado = resultado + "  " + alunos.get(i).toString() + "\n";
        }

        resultado = resultado + "\n--- Avaliacoes ---\n";
        for (int i = 0; i < avaliacoes.size(); i++) {
            resultado = resultado + "  " + avaliacoes.get(i).toString() + "\n";
        }

        resultado = resultado + "================================";
        return resultado;
    }
}
