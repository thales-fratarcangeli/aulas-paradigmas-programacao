public class TestaStreaming {
    public static void main(String[] args) {

        Streaming s1 = new Streaming("Thales", "Premium");
        System.out.println(s1.toString());
        System.out.println();

        s1.assistirFilme("Interestelar");
        System.out.println(s1.toString());
        System.out.println();

        s1.cancelarAssinatura();
        s1.assistirFilme("Matrix");
        System.out.println();
        System.out.println(s1.toString());
    }
}
