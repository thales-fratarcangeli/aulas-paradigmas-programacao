public class TestaTime {
    public static void main(String[] args) {

        // atletas existem independente do time
        Atleta a1 = new Atleta(1, "Lucas Dias", "Armador");
        Atleta a2 = new Atleta(2, "Pedro Henrique", "Ala-Pivô");
        Atleta a3 = new Atleta(3, "Rafael Oliveira", "Pivô");

        Time franca = new Time(1, "Franca Basquete", "Helinho");
        franca.contratarAtleta(a1);
        franca.contratarAtleta(a2);
        franca.contratarAtleta(a3);
        System.out.println();

        System.out.println(franca.toString());

        // provando que se o time for anulado, o atleta continua existindo
        System.out.println("--- Anulando o time ---");
        franca = null;

        // o atleta ainda existe!
        System.out.println("Atleta apos anular o time: " + a1.toString());
        System.out.println("Atleta apos anular o time: " + a2.toString());
    }
}
