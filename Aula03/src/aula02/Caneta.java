/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author isa.mdeo
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    public void status(){
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Está tampada? "+this.tampada);
        System.out.println("Modelo "+this.modelo);
        System.out.println("Espessura da ponta? "+this.ponta);
        System.out.println("Porcentagem da carga "+this.carga);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO");
        }
        else {
            System.out.println("Estou rabiscando");
        }
    }
     protected void tampar (){
         this.tampada= true;
     }
     protected void destampar(){
         this.tampada=false;
         
     }
     
    
            
}
