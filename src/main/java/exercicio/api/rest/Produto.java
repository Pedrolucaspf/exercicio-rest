/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.api.rest;

/**
 *
 * @author aluno
 */
public abstract class Produto {
    public enum TAMANHO {P, M, G, GG};
    private String cor;
    private TAMANHO tamanho;
    private float preco;
    private String nome;
    
    public Produto(String cor, TAMANHO tamanho, String nome) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.nome = nome;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the tamanho
     */
    public TAMANHO getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(TAMANHO tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the codigo
     */

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
