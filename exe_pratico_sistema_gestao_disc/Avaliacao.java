import java.util.ArrayList;

public class Avaliacao {

    private int id;
    private String nome;
    private ArrayList<Questao> questoes;

    // construtor
    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<Questao>();
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

    public ArrayList<Questao> getQuestoes() {
        return questoes;
    }

    // metodo de composicao - cria a questao internamente
    public void adicionarQuestao(int num, String texto, float peso) {
        Questao q = new Questao(num, texto, peso);
        questoes.add(q);
        System.out.println("Questao " + num + " adicionada na avaliacao " + nome);
    }

    public String toString() {
        String resultado = "Avaliacao [ID=" + id + ", Nome=" + nome + "]\n";
        resultado = resultado + "  Questoes:\n";
        for (int i = 0; i < questoes.size(); i++) {
            resultado = resultado + "    " + questoes.get(i).toString() + "\n";
        }
        return resultado;
    }
}
