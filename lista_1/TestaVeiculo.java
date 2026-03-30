public class TestaVeiculo {
    public static void main(String[] args) {

        // instancias normais
        Veiculo v1 = new Veiculo("Toyota", "Corolla", 180);
        Aviao av1 = new Aviao("Boeing", "737", 850, 12000);
        CarroEletrico ce1 = new CarroEletrico("Tesla", "Model 3", 200, 450);

        System.out.println("--- Chamando metodos normalmente ---");
        v1.mover();
        v1.abastecer();
        System.out.println();

        av1.mover();
        av1.abastecer();
        System.out.println();

        ce1.mover();
        ce1.abastecer();
        System.out.println();

        // polimorfismo - variavel do tipo Veiculo apontando pra Aviao
        System.out.println("--- Polimorfismo ---");
        Veiculo veiculo = new Aviao("Embraer", "E195", 870, 13000);
        veiculo.mover(); // vai chamar o mover() do Aviao

        // mudando a mesma variavel pra CarroEletrico
        veiculo = new CarroEletrico("BYD", "Dolphin", 160, 400);
        veiculo.mover(); // vai chamar o mover() do CarroEletrico

        System.out.println();
        System.out.println("--- toString ---");
        System.out.println(v1.toString());
        System.out.println(av1.toString());
        System.out.println(ce1.toString());
    }
}
