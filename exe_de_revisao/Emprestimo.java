import java.time.LocalDateTime;

public class Emprestimo {

    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucaoPrevista;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo(LocalDateTime dataEmprestimo, LocalDateTime dataDevolucaoPrevista, Leitor leitor, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.leitor = leitor;
        this.livro = livro;
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDateTime getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDateTime dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String toString() {
        return "--- Emprestimo ---\n" +
               "Leitor: " + leitor.getNome() + "\n" +
               "Livro: " + livro.getTitulo() + "\n" +
               "Data Emprestimo: " + dataEmprestimo + "\n" +
               "Devolucao Prevista: " + dataDevolucaoPrevista;
    }
}
