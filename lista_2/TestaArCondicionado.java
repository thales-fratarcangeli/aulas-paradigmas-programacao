public class TestaArCondicionado {
    public static void main(String[] args) {

        // usando construtor com parametros
        ArCondicionado ac1 = new ArCondicionado("Samsung", "WindFree", 22, true);
        System.out.println(ac1.toString());
        System.out.println();

        // tentando setar temperatura fora da faixa
        ac1.setTemperatura(10);
        ac1.setTemperatura(35);
        System.out.println();

        // setando temperatura valida
        ac1.setTemperatura(24);
        System.out.println("Temperatura ajustada para: " + ac1.getTemperatura());
        System.out.println();

        // tentando marca invalida
        ArCondicionado ac2 = new ArCondicionado();
        ac2.setMarca("LG");
        ac2.setMarca("Consul");
        ac2.setModelo("Inverter");
        ac2.setTemperatura(20);
        ac2.setLigado(true);
        System.out.println(ac2.toString());
        System.out.println();

        // ativando modo turbo
        ac1.ativarModoTurbo();
        System.out.println(ac1.toString());
    }
}
