import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {

        // 1. instanciar 2 filmes (existem independente)
        Filme f1 = new Filme(1, "Batman", "Acao", 152);
        Filme f2 = new Filme(2, "Duna", "Ficcao Cientifica", 166);

        System.out.println("Filmes cadastrados:");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println();

        // 2. instanciar sessao para 20/07/2026 as 20h
        LocalDateTime horarioSessao = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao sessao1 = new Sessao(1, horarioSessao, 1);

        // 3. agregacao - vincular filme Batman
        sessao1.vincularFilme(f1);
        System.out.println();

        // 4. composicao - vender 3 ingressos
        sessao1.venderIngresso(1, "A1", "Inteira", 32.00f);
        sessao1.venderIngresso(2, "A2", "Meia", 16.00f);
        sessao1.venderIngresso(3, "A3", "Inteira", 32.00f);
        System.out.println();

        // 5. imprimir dados da sessao
        System.out.println(sessao1.toString());
    }
}
