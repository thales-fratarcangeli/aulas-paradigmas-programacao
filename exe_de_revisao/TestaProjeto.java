public class TestaProjeto {
    public static void main(String[] args) {

        Programador p1 = new Programador(1, "Thales", "Java");
        Programador p2 = new Programador(2, "Lucas", "Python");
        Programador p3 = new Programador(3, "Mariana", "JavaScript");

        Projeto proj = new Projeto(1, "Sistema E-commerce");
        proj.adicionarProgramador(p1);
        proj.adicionarProgramador(p2);
        proj.adicionarProgramador(p3);
        System.out.println();

        proj.listarProgramadores();
        System.out.println();

        System.out.println(proj.toString());
    }
}
