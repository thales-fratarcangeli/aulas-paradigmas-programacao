public class Senior extends Desenvolvedor {

    public Senior() {
    }

    public Senior(int id, String nome, float salario) {
        super(id, nome, salario);
    }

    public void codar() {
        System.out.println(getNome() + " (Senior) esta codando e liderando o time...");
    }

    public float calcularBonus() {
        return getSalario() * 0.25f;
    }

    public String toString() {
        return "Senior [ID=" + getId() + ", Nome=" + getNome() + ", Salario=R$" + getSalario() + ", Bonus=R$" + calcularBonus() + "]";
    }
}
