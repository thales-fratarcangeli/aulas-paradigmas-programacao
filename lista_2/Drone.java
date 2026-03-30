public class Drone {

    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    // construtor
    public Drone(String codigo, int bateria) {
        this.codigo = codigo;
        setBateria(bateria);
        this.altura = 0;
        this.emVoo = false;
    }

    // getters
    public String getCodigo() {
        return codigo;
    }

    public float getAltura() {
        return altura;
    }

    public int getBateria() {
        return bateria;
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    // setters com regras
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAltura(float a) {
        if (a >= 0 && a <= 120) {
            this.altura = a;
        } else {
            System.out.println("Altura invalida! O drone nao pode voar abaixo de 0 ou acima de 120 metros.");
        }
    }

    public void setBateria(int b) {
        if (b >= 0 && b <= 100) {
            this.bateria = b;
        } else {
            System.out.println("Bateria invalida! Deve estar entre 0 e 100.");
        }
    }

    // metodo publico
    public void decolar() {
        if (bateria > 20) {
            if (testarMotores()) {
                emVoo = true;
                setAltura(2);
                System.out.println("Drone decolou! Altitude: 2 metros.");
            } else {
                System.out.println("Falha nos motores! Decolagem cancelada.");
            }
        } else {
            System.out.println("Bateria insuficiente para decolar! Minimo 20%.");
        }
    }

    // metodo privado
    private boolean testarMotores() {
        System.out.println("Testando helices...");
        System.out.println("Calibrando GPS...");
        double teste = Math.random() * 10;
        System.out.println("Resultado do teste: " + teste);
        if (teste < 8) {
            return true;
        } else {
            return false;
        }
    }

    // metodos de voo
    public void subir(float x) {
        if (emVoo == true) {
            setAltura(altura + x);
        } else {
            System.out.println("O drone nao esta em voo!");
        }
    }

    public void descer(float x) {
        if (emVoo) {
            setAltura(altura - x);
        } else {
            System.out.println("O drone nao esta em voo!");
        }
    }

    public String toString() {
        String statusVoo;
        if (emVoo) {
            statusVoo = "Em voo";
        } else {
            statusVoo = "No solo";
        }
        return "--- Drone ---\n" +
               "Codigo: " + codigo + "\n" +
               "Altura: " + altura + "m\n" +
               "Bateria: " + bateria + "%\n" +
               "Status: " + statusVoo;
    }
}
