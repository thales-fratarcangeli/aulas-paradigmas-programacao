public class Streaming {

    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean ativo;
    public String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;
        this.ativo = true;
        this.ultimoFilmeAssistido = "";

        // definir mensalidade pelo plano
        if (plano == "Basico") {
            mensalidade = 25.90f;
        } else if (plano == "Premium") {
            mensalidade = 45.90f;
        } else if (plano == "Familia") {
            mensalidade = 60.90f;
        }
    }

    public void assistirFilme(String nomeFilme) {
        if (ativo == true) {
            ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Conta suspensa! Pague a fatura para continuar assistindo.");
        }
    }

    public void cancelarAssinatura() {
        ativo = false;
        System.out.println("Assinatura cancelada.");
    }

    public String toString() {
        String statusConta;
        if (ativo) {
            statusConta = "Ativo";
        } else {
            statusConta = "Suspenso";
        }
        return "--- Perfil Streaming ---\n" +
               "Usuario: " + usuario + "\n" +
               "Plano: " + plano + "\n" +
               "Mensalidade: R$" + mensalidade + "\n" +
               "Status: " + statusConta + "\n" +
               "Ultimo filme: " + ultimoFilmeAssistido;
    }
}
