public class TestaPlacar {
    public static void main(String[] args) {

        Placar jogo = new Placar("Franca Basquete", "Flamengo");

        jogo.registrarPonto("casa", 3);
        jogo.registrarPonto("visitante", 2);
        jogo.registrarPonto("casa", 1);
        System.out.println(jogo.toString());
        System.out.println();

        jogo.proximoQuarto();
        jogo.registrarPonto("visitante", 3);
        jogo.registrarPonto("casa", 2);
        System.out.println(jogo.toString());
        System.out.println();

        jogo.proximoQuarto();
        jogo.proximoQuarto();
        jogo.proximoQuarto(); // ja terminou
        System.out.println();
        System.out.println(jogo.toString());
    }
}
