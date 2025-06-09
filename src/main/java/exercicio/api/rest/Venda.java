/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.api.rest;

import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author aluno
 */
public class Venda {
    private Date data;
    private float desconto;
    private ArrayList<Vendedor> vendedores;
    private Cliente comprador;
    private ArrayList<Produto> produtos;

    public Venda(Date data, float desconto, ArrayList<Vendedor> vendedores, Cliente comprador, ArrayList<Produto> produtos) {
        this.data = data;
        this.desconto = desconto;
        this.vendedores = vendedores;
        this.comprador = comprador;
        this.produtos = produtos;
    }
    
    public float calcularValor(){
        float f = 0.0f;
        return f;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
    
    public void addVendedor(Vendedor v){
        vendedores.add(v);
    }

    public Cliente getComprador() {
        return comprador;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    
}
