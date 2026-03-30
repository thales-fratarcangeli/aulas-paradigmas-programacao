public class Aviao extends Veiculo {

    private float altitudeMax;

    public Aviao() {
    }

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    public float getAltitudeMax() {
        return altitudeMax;
    }

    public void setAltitudeMax(float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    public void mover() {
        System.out.println("Aviao voando a " + getVelocidade() + " km/h e " + altitudeMax + " metros");
    }

    public void abastecer() {
        System.out.println("Abastecendo com querosene de aviacao");
    }

    public String toString() {
        return "Aviao [Marca=" + getMarca() + ", Modelo=" + getModelo() + ", Velocidade=" + getVelocidade() + " km/h, AltitudeMax=" + altitudeMax + "m]";
    }
}
