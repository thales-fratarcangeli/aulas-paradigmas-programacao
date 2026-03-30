public class Pleno extends Desenvolvedor {

    public Pleno() {
    }

    public Pleno(int id, String nome, float salario) {
        super(id, nome, salario);
    }

    public void codar() {
        System.out.println(getNome() + " (Pleno) esta codando de forma autonoma...");
    }

    public float calcularBonus() {
        return getSalario() * 0.15f;
    }

    public String toString() {
        return "Pleno [ID=" + getId() + ", Nome=" + getNome() + ", Salario=R$" + getSalario() + ", Bonus=R$" + calcularBonus() + "]";
    }
}
