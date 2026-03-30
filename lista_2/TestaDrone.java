public class TestaDrone {
    public static void main(String[] args) {

        Drone d1 = new Drone("DJI-001", 85);
        System.out.println(d1.toString());
        System.out.println();

        // tentando decolar
        d1.decolar();
        System.out.println(d1.toString());
        System.out.println();

        // subindo
        d1.subir(30);
        System.out.println("Altura atual: " + d1.getAltura() + "m");

        // subindo mais
        d1.subir(50);
        System.out.println("Altura atual: " + d1.getAltura() + "m");
        System.out.println();

        // tentando ultrapassar o limite
        d1.subir(100);
        System.out.println("Altura atual: " + d1.getAltura() + "m");
        System.out.println();

        // descendo
        d1.descer(20);
        System.out.println("Altura atual: " + d1.getAltura() + "m");
        System.out.println();

        // drone com bateria baixa
        Drone d2 = new Drone("DJI-002", 15);
        d2.decolar();
        System.out.println();

        System.out.println(d1.toString());
    }
}
