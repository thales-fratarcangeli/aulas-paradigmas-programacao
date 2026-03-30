public class TestaVenda {
    public static void main(String[] args) {

        // produtos existem no estoque (independentes)
        Produto p1 = new Produto(1, "Arroz 5kg", 28.90f);
        Produto p2 = new Produto(2, "Feijao 1kg", 8.50f);
        Produto p3 = new Produto(3, "Oleo de Soja", 7.99f);

        // cliente existe independente
        Cliente cli = new Cliente(1, "Carlos Eduardo");

        // venda agrega o cliente
        Venda v1 = new Venda(1001, cli);

        // composicao - itens nascem dentro da venda, mas agregam produtos
        v1.adicionarItem(1, 2, p1);  // 2 pacotes de arroz
        v1.adicionarItem(2, 3, p2);  // 3 pacotes de feijao
        v1.adicionarItem(3, 1, p3);  // 1 oleo
        System.out.println();

        System.out.println(v1.toString());
        System.out.println();

        // provando agregacao: se a venda sumir, cliente e produtos continuam
        System.out.println("--- Anulando a venda ---");
        v1 = null;
        System.out.println("Cliente ainda existe: " + cli.toString());
        System.out.println("Produto ainda existe: " + p1.toString());
    }
}
