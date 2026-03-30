public class Computador {

    private int id;
    private String marca;
    private Processador processador;

    // COMPOSICAO - o processador e criado dentro do construtor
    public Computador(int id, String marca, String marcaProc, String modeloProc, float freqProc) {
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(marcaProc, modeloProc, freqProc);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Processador getProcessador() {
        return processador;
    }

    public String toString() {
        return "--- Computador ---\n" +
               "ID: " + id + "\n" +
               "Marca: " + marca + "\n" +
               "Processador: " + processador.toString();
    }
}
