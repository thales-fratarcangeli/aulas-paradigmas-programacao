import java.util.ArrayList;

public class Venda {

    private int id;
    private Cliente cliente; // AGREGACAO - cliente existe fora
    private ArrayList<ItemVenda> itens; // COMPOSICAO - itens nascem dentro da venda

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<ItemVenda>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    // COMPOSICAO - cria o ItemVenda internamente, mas o Produto vem de fora (agregacao)
    public void adicionarItem(int idItem, int quantidade, Produto produto) {
        ItemVenda item = new ItemVenda(idItem, quantidade, produto);
        itens.add(item);
        System.out.println("Item adicionado: " + produto.getNome() + " x" + quantidade);
    }

    public float calcularTotal() {
        float total = 0;
        for (int i = 0; i < itens.size(); i++) {
            total = total + itens.get(i).getSubtotal();
        }
        return total;
    }

    public String toString() {
        String resultado = "========== VENDA ==========\n";
        resultado = resultado + "ID Venda: " + id + "\n";
        resultado = resultado + "Cliente: " + cliente.getNome() + "\n";
        resultado = resultado + "\nItens:\n";
        for (int i = 0; i < itens.size(); i++) {
            resultado = resultado + "  " + itens.get(i).toString() + "\n";
        }
        resultado = resultado + "\nTOTAL: R$" + calcularTotal() + "\n";
        resultado = resultado + "===========================";
        return resultado;
    }
}
