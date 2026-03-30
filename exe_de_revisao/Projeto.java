import java.util.ArrayList;

public class Projeto {

    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores;

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadores = new ArrayList<Programador>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    // AGREGACAO
    public void adicionarProgramador(Programador p) {
        programadores.add(p);
        System.out.println(p.getNome() + " adicionado ao projeto " + nomeProjeto);
    }

    // listar todos os programadores do projeto
    public void listarProgramadores() {
        System.out.println("Programadores do projeto " + nomeProjeto + ":");
        for (int i = 0; i < programadores.size(); i++) {
            System.out.println("  " + programadores.get(i).toString());
        }
    }

    public String toString() {
        String resultado = "--- Projeto ---\n";
        resultado = resultado + "ID: " + id + "\n";
        resultado = resultado + "Nome: " + nomeProjeto + "\n";
        resultado = resultado + "Programadores: " + programadores.size() + "\n";
        return resultado;
    }
}
