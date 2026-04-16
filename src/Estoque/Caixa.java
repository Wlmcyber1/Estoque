package Estoque;

public interface Caixa {
    public abstract void consultarEstoque(int id);
    public abstract void processarPagamento(float valorrRecebido);
}
