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
public class Abstratas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r;
        CalculadoraCientifica oCC = new CalculadoraCientifica(4,5);
       r = oCC.somar();
       oCC.mostrar(r);
       
       CalculadoraCientifica oCC1 = new CalculadoraCientifica();
       r = oCC1.raizquadrada(45);
       oCC1.mostrar(r);
       
        CalculadoraCientifica oCC2 = new CalculadoraCientifica(6.7,89);
        r = oCC2.multiplicar();
        oCC2.mostrar(r);
    }
    
       
        
   
    
}
