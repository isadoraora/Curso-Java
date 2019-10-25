/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementação;

/**
 *
 * @author isa.mdeo
 */
public class Contato {
    private String nome, email;
    private int codigo;
    
    public void Contato(){
        
    }
    public void Contato(String n, String e, int c){
        this.codigo=c;
        this.email=e;
        this.nome=n;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String toString(){
        return "codigo"+getCodigo()+"nome"+getNome()+"email"+getEmail();
    }
}
