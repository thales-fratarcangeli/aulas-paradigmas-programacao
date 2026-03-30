public class TestaComputador {
    public static void main(String[] args) {

        // processador nasce dentro do computador (composicao)
        Computador pc1 = new Computador(1, "Dell", "Intel", "Core i7-13700K", 5.4f);
        System.out.println(pc1.toString());
        System.out.println();

        Computador pc2 = new Computador(2, "Lenovo", "AMD", "Ryzen 7 7800X3D", 4.5f);
        System.out.println(pc2.toString());

        // se deletar o computador, o processador tambem morre
        // pois ninguem mais tem referencia pra ele
        System.out.println("\n--- Anulando pc1 ---");
        pc1 = null;
        System.out.println("pc1 foi anulado, o processador dele tambem foi.");
    }
}
