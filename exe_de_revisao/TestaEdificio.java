public class TestaEdificio {
    public static void main(String[] args) {

        Edificio ed = new Edificio("Residencial Aurora", "Rua das Flores, 100 - Franca/SP");

        ed.construirApartamento(101, 1);
        ed.construirApartamento(102, 1);
        ed.construirApartamento(201, 2);
        ed.construirApartamento(202, 2);
        ed.construirApartamento(301, 3);
        System.out.println();

        System.out.println(ed.toString());
    }
}
