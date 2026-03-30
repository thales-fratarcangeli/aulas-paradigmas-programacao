public class TestaVetorPolimorfico {
    public static void main(String[] args) {

        // vetor de tamanho 4 do tipo Desenvolvedor
        Desenvolvedor[] devs = new Desenvolvedor[4];

        // preenchendo com objetos de tipos diferentes
        devs[0] = new Junior(1, "Pedro", 3000);
        devs[1] = new Pleno(2, "Mariana", 6500);
        devs[2] = new Senior(3, "Ricardo", 12000);
        devs[3] = new Desenvolvedor(4, "Ana", 4000); // generico

        // percorrendo com for e chamando os metodos
        for (int i = 0; i < devs.length; i++) {
            System.out.println("=== Desenvolvedor " + (i + 1) + " ===");
            devs[i].codar();
            System.out.println("Bonus: R$" + devs[i].calcularBonus());
            System.out.println(devs[i].toString());
            System.out.println();
        }
    }
}
