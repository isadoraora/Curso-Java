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
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Está tampada? "+this.tampada);
        System.out.println("Modelo "+this.modelo);
        System.out.println("Espessura da ponta? "+this.ponta);
        System.out.println("Porcentagem da carga "+this.carga);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO");
        }
        else {
            System.out.println("Estou rabiscando");
        }
    }
     void tampar (){
         this.tampada= true;
     }
     void destampar(){
         this.tampada=false;
         
     }
     
    
            
}
