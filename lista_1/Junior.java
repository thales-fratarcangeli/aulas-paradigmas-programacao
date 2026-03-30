public class Junior extends Desenvolvedor {

    public Junior() {
    }

    public Junior(int id, String nome, float salario) {
        super(id, nome, salario);
    }

    public void codar() {
        System.out.println(getNome() + " (Junior) esta codando com supervisao...");
    }

    public float calcularBonus() {
        return getSalario() * 0.05f;
    }

    public String toString() {
        return "Junior [ID=" + getId() + ", Nome=" + getNome() + ", Salario=R$" + getSalario() + ", Bonus=R$" + calcularBonus() + "]";
    }
}
