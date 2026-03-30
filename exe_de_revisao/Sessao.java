import java.util.ArrayList;
import java.time.LocalDateTime;

public class Sessao {

    private int id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme; // AGREGACAO
    private ArrayList<Ingresso> ingressos; // COMPOSICAO

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.filme = null;
        this.ingressos = new ArrayList<Ingresso>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    // AGREGACAO - filme ja existe, so vincula
    public void vincularFilme(Filme f) {
        this.filme = f;
        System.out.println("Filme '" + f.getTitulo() + "' vinculado a sessao.");
    }

    // COMPOSICAO - cria o ingresso internamente
    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso ing = new Ingresso(id, assento, tipo, preco);
        ingressos.add(ing);
        System.out.println("Ingresso vendido: Assento " + assento + " (" + tipo + ")");
    }

    public String toString() {
        String resultado = "========== SESSAO ==========\n";
        resultado = resultado + "ID: " + id + "\n";
        resultado = resultado + "Horario: " + horario + "\n";
        resultado = resultado + "Sala: " + sala + "\n";

        if (filme != null) {
            resultado = resultado + "Filme: " + filme.getTitulo() + " (" + filme.getGenero() + ", " + filme.getDuracao() + " min)\n";
        } else {
            resultado = resultado + "Filme: Nenhum vinculado\n";
        }

        resultado = resultado + "\nIngressos vendidos:\n";
        for (int i = 0; i < ingressos.size(); i++) {
            resultado = resultado + "  " + ingressos.get(i).toString() + "\n";
        }
        resultado = resultado + "============================";
        return resultado;
    }
}
