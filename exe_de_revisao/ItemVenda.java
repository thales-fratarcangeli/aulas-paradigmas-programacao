public class ItemVenda {

    private int id;
    private int quantidade;
    private Produto produto; // agregacao - produto existe independente

    public ItemVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getSubtotal() {
        return produto.getPreco() * quantidade;
    }

    public String toString() {
        return "ItemVenda [ID=" + id + ", Produto=" + produto.getNome() + ", Qtd=" + quantidade + ", Subtotal=R$" + getSubtotal() + "]";
    }
}
