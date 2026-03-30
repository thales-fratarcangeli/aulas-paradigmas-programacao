import java.time.LocalDateTime;

public class TestaBiblioteca {
    public static void main(String[] args) {

        Leitor l1 = new Leitor(1, "Ana Costa");
        Livro liv1 = new Livro(1, "O Senhor dos Aneis", "J.R.R. Tolkien");

        LocalDateTime dataEmp = LocalDateTime.of(2026, 4, 10, 9, 0);
        LocalDateTime dataDev = LocalDateTime.of(2026, 4, 24, 9, 0);

        Emprestimo emp1 = new Emprestimo(dataEmp, dataDev, l1, liv1);
        System.out.println(emp1.toString());
    }
}
