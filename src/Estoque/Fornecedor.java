package Estoque;

import java.util.Scanner;

public class Fornecedor {
    private int quantd_vendas;

    private float preco_unitario;

    public void setQuantd_vendas(int quantd_vendas) {
        this.quantd_vendas = quantd_vendas;
    }

    public int getQuantd_vendas() {
        return quantd_vendas;
    }

    public float getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(float preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public void entregarMercadoria (Loja lojadestino){
        Scanner input = new Scanner(System.in);


        System.out.println("Digite o nome do produto");
        String nomeProd = input.nextLine();


        System.out.println("Digite o id");
        int idProd = input.nextInt();

        System.out.println("Digite a quantidade");
        int qtdProd = input.nextInt();

        System.out.println("Digite o preco");
        float precoProd = input.nextFloat();

        Produto novo = new Produto(idProd, qtdProd, precoProd, nomeProd);



    }
    public void cobranca (int qtd, float preco_unitario, Loja loja ){
        this.quantd_vendas = qtd;
        this.preco_unitario = preco_unitario;
        float valorTotal = preco_unitario * qtd;
        System.out.println("O fornecedor está cobrando R$ " + valorTotal);
        loja.pagarConta(valorTotal);


    }
}
