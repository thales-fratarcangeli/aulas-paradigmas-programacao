public class ArCondicionado {

    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    // construtor vazio
    public ArCondicionado() {
    }

    // construtor com todos os parametros
    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        setMarca(marca);
        this.modelo = modelo;
        setTemperatura(temperatura);
        this.ligado = ligado;
    }

    // getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public boolean isLigado() {
        return ligado;
    }

    // setters
    public void setMarca(String m) {
        if (m.length() >= 3) {
            this.marca = m;
        } else {
            System.out.println("Marca invalida! Precisa ter pelo menos 3 caracteres.");
        }
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTemperatura(int t) {
        if (t >= 16 && t <= 30) {
            this.temperatura = t;
        } else {
            System.out.println("Temperatura fora da faixa! Use entre 16 e 30.");
        }
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // metodo publico
    public void ativarModoTurbo() {
        if (verificarCompressor()) {
            System.out.println("Compressor Ok! Ativando modo turbo...");
            setTemperatura(16);
        } else {
            System.out.println("Falha no compressor! Nao foi possivel ativar o modo turbo.");
        }
    }

    // metodo privado
    private boolean verificarCompressor() {
        double checagem = Math.random() * 10;
        System.out.println("Verificando compressor... valor: " + checagem);
        if (checagem > 2) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String status;
        if (ligado == true) {
            status = "Ligado";
        } else {
            status = "Desligado";
        }
        return "--- Ar Condicionado ---\n" +
               "Marca: " + marca + "\n" +
               "Modelo: " + modelo + "\n" +
               "Temperatura: " + temperatura + " graus\n" +
               "Status: " + status;
    }
}
