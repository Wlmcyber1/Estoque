package Estoque;

public class Produto {
    private int id_produto;
    private int quantidade;

    private float preco;
    private String nome;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }


    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(int id_produto, int quantidade, float preco, String nome){
        this.preco = preco;
        this.quantidade = quantidade;
        this.id_produto = id_produto;
        this.nome= nome;

    }

}
