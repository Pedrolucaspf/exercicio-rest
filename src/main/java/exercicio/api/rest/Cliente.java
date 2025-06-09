/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.api.rest;

public class Cliente extends Usuario {
    private String email;
    private String nome;
    private String cpf;
    
    public Cliente(String login, String password, String email, String cpf, String nome) {
        super(login, password);
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
    }   
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }
}
