public class TestaConta {
    public static void main(String[] args) {

        // 1. instanciar c1 para Joao Silva
        Conta c1 = new Conta(1001, 123, "Joao Silva");

        // 2. depositar 500
        c1.depositar(500);

        // 3. sacar 200 e imprimir
        c1.sacar(200);
        System.out.println(c1.toString());
        System.out.println();

        // 4. instanciar c2 para Maria Souza
        Conta c2 = new Conta(1002, 123, "Maria Souza");

        // 5. tentar sacar 50 sem saldo
        c2.sacar(50);
        System.out.println();

        // 6. tentar encerrar c1 com saldo
        c1.encerrarConta();
        System.out.println();

        // 7. sacar o restante, encerrar e imprimir
        c1.sacar(300);
        c1.encerrarConta();
        System.out.println(c1.toString());
    }
}
