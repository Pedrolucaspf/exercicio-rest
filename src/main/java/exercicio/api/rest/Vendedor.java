/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.api.rest;
import java.util.ArrayList;
/**
 *
 * @author aluno
 */
public class Vendedor extends Usuario{
    private static float salarioBase;
    private float salario;
    private ArrayList<Venda> vendas;
    
    public Vendedor(String cpf, String nome) {
        super(cpf, nome);
        this.salario = salarioBase;
    }
    
    public void addVenda(Venda v){
        vendas.add(v);
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the salarioBase
     */
    public static float getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param aSalarioBase the salarioBase to set
     */
    public static void setSalarioBase(float aSalarioBase) {
        salarioBase = aSalarioBase;
    }
    
}
