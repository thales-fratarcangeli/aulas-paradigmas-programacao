import java.util.ArrayList;

public class Time {

    private int id;
    private String nome;
    private String tecnico;
    private ArrayList<Atleta> atletas;

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = new ArrayList<Atleta>();
    }

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

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    // AGREGACAO - atleta ja existe, so vincula
    public void contratarAtleta(Atleta a) {
        atletas.add(a);
        System.out.println(a.getNome() + " contratado pelo " + nome + "!");
    }

    public String toString() {
        String resultado = "--- Time ---\n";
        resultado = resultado + "ID: " + id + "\n";
        resultado = resultado + "Nome: " + nome + "\n";
        resultado = resultado + "Tecnico: " + tecnico + "\n";
        resultado = resultado + "Elenco:\n";
        for (int i = 0; i < atletas.size(); i++) {
            resultado = resultado + "  " + atletas.get(i).toString() + "\n";
        }
        return resultado;
    }
}
