package javabook.chapter03.exercise3_12.domain;

public class Invoice {
    private String nome;
    private String descricao;
    private int quantidadeComprada;
    private double precoItem;

    public Invoice(String nome, String descricao, int quantidadeComprada, double precoItem) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidadeComprada = quantidadeComprada;
        this.precoItem = precoItem;
    }

    public void getInvoiceAmount() {
        if (quantidadeComprada <= 0 || precoItem <= 0) {
            quantidadeComprada = 0;
            precoItem = 0;
        } else {
            double valorFatura = quantidadeComprada * precoItem;
            System.out.print(valorFatura);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
}
