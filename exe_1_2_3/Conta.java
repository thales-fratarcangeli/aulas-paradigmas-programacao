public class Conta {

    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    // construtor
    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    public void depositar(float valor) {
        if (status == true) {
            saldo = saldo + valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Conta inativa, nao e possivel depositar.");
        }
    }

    public void sacar(float valor) {
        if (status == true) {
            if (saldo >= valor) {
                saldo = saldo - valor;
                System.out.println("Saque de R$" + valor + " realizado!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Conta inativa!");
        }
    }

    public void encerrarConta() {
        if (saldo == 0) {
            status = false;
            System.out.println("Conta encerrada com sucesso.");
        } else {
            System.out.println("Voce precisa sacar o valor restante antes de encerrar a conta!");
        }
    }

    public String toString() {
        String situacao;
        if (status == true) {
            situacao = "Ativa";
        } else {
            situacao = "Encerrada";
        }
        return "--- Dados da Conta ---\n" +
               "Numero: " + numeroConta + "\n" +
               "Agencia: " + agencia + "\n" +
               "Cliente: " + nomeCliente + "\n" +
               "Saldo: R$" + saldo + "\n" +
               "Status: " + situacao;
    }
}
