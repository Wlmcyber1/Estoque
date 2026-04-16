package Estoque;

import java.util.ArrayList;

public class Loja implements Caixa{
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private float caixaTotal;

    public void pagarConta (float cobranca){
        if(cobranca > 0 && getCaixaTotal()>= cobranca){
            setCaixaTotal(getCaixaTotal() - cobranca);
        }
        else {
            System.out.println("Sem saldo");
        }

    }

    public void setCaixaTotal(float caixaTotal) {
        this.caixaTotal = caixaTotal;
    }

    public float getCaixaTotal() {
        return caixaTotal;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

//então eu pego o produto na posicão i com o id de produto
    @Override
    public void consultarEstoque(int id) {
        for(int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).getId_produto() == id){
                System.out.println("Temos o produto!");
                break;
            }else {
                System.out.println("Não temos o produto ");
            }
        }

    }

    @Override
    public void processarPagamento(float valorRecebido) {
        if (valorRecebido > 0){
            setCaixaTotal(getCaixaTotal()+valorRecebido);
            System.out.println("Processamento pagamento...");
            System.out.println("Compra aprovada ");
        }
        else{
            System.out.println("Valor invalido para o processamento");
        }


    }


}

