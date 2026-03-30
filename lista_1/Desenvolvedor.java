public class Desenvolvedor {

    private int id;
    private String nome;
    private float salario;

    public Desenvolvedor() {
    }

    public Desenvolvedor(int id, String nome, float salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void codar() {
        System.out.println(nome + " esta codando...");
    }

    public float calcularBonus() {
        return salario * 0.10f;
    }

    public String toString() {
        return "Desenvolvedor [ID=" + id + ", Nome=" + nome + ", Salario=R$" + salario + "]";
    }
}
