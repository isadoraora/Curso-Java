/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhadepagamento;

/**
 *
 * @author isa.mdeo
 */
public abstract class Empregado {
    private String nome;
    
    public Empregado(String n){
        this.nome = n;
    }
    public void printPay(){
      
   }
    public abstract double getPay();
}
