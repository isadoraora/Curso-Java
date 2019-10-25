/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstratas;

/**
 *
 * @author isa.mdeo
 */
public abstract class Calculadora {
    private double x,y;
    
    public abstract void x();
    
    public Calculadora(){
        
    }
    public Calculadora(double px, double py){
        x = px;
        y = py;
    }
     public double somar(){
         return x+y;
     }
     public double subtrair(){
         return x-y;
     }
     public double multiplicar(){
         return x*y;
     }
     public double dividir(){
         return x/y;
     }
}
