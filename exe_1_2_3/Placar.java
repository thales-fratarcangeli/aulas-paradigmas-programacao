public class Placar {

    public String nomeTimeCasa;
    public String nomeTimeVisitante;
    public int pontosCasa;
    public int pontosVisitante;
    public int periodoQuarto;

    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo) {
        if (time == "casa") {
            pontosCasa = pontosCasa + tipo;
        } else if (time == "visitante") {
            pontosVisitante = pontosVisitante + tipo;
        }
        System.out.println("Ponto registrado! +" + tipo + " para " + time);
    }

    public void proximoQuarto() {
        if (periodoQuarto >= 4) {
            System.out.println("O jogo ja terminou!");
        } else {
            periodoQuarto = periodoQuarto + 1;
            System.out.println("Inicio do " + periodoQuarto + "o quarto!");
        }
    }

    public String toString() {
        return nomeTimeCasa + " " + pontosCasa + " x " + pontosVisitante + " " + nomeTimeVisitante + " - Periodo: " + periodoQuarto + "o quarto";
    }
}
