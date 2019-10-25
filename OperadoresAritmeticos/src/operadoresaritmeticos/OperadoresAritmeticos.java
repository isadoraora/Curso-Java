/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author isa.mdeo
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.println("media = "+m);
        int numero =10;
        int valor = 4+ numero--;
        System.out.println(valor);
        System.out.println(numero);
        
       int x = 10;
        x/=3;
        System.out.println(x); 
      
      float v = 1.9f;
      int ar = (int) Math.ceil(v);
        System.out.println(ar); 
      
      double ale = Math.random();
      int n = (int)(2 +ale * (6-2));
        System.out.println(n);
    }
    
    
}
