public class CarroEletrico extends Veiculo {

    private int autonomiaBateria;

    public CarroEletrico() {
    }

    public CarroEletrico(String marca, String modelo, float velocidade, int autonomiaBateria) {
        super(marca, modelo, velocidade);
        this.autonomiaBateria = autonomiaBateria;
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    public void mover() {
        System.out.println("Carro eletrico movendo-se silenciosamente");
    }

    public void abastecer() {
        System.out.println("Recarregando bateria em posto de carga rapida");
    }

    public String toString() {
        return "CarroEletrico [Marca=" + getMarca() + ", Modelo=" + getModelo() + ", Velocidade=" + getVelocidade() + " km/h, Autonomia=" + autonomiaBateria + " km]";
    }
}
