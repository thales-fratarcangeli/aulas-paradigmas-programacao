public class Processador {

    private String marca;
    private String modelo;
    private float frequencia;

    public Processador(String marca, String modelo, float frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    public String toString() {
        return "Processador [Marca=" + marca + ", Modelo=" + modelo + ", Freq=" + frequencia + " GHz]";
    }
}
