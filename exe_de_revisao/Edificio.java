import java.util.ArrayList;

public class Edificio {

    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<Apartamento>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // COMPOSICAO - recebe dados primitivos e cria o objeto internamente
    public void construirApartamento(int num, int andar) {
        Apartamento apto = new Apartamento(num, andar);
        apartamentos.add(apto);
        System.out.println("Apartamento " + num + " construido no andar " + andar);
    }

    public String toString() {
        String resultado = "--- Edificio ---\n";
        resultado = resultado + "Nome: " + nome + "\n";
        resultado = resultado + "Endereco: " + endereco + "\n";
        resultado = resultado + "Apartamentos:\n";
        for (int i = 0; i < apartamentos.size(); i++) {
            resultado = resultado + "  " + apartamentos.get(i).toString() + "\n";
        }
        return resultado;
    }
}
