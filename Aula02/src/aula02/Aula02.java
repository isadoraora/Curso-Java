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
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.carga = 90;
        c1.cor = "Azul";
        c1.ponta= 0.5f;
        c1.modelo = "Bic";
        c1.tampar();
        c1.status();
        c1.rabiscar();
        System.out.println("\n");
        Caneta c2 = new Caneta();
        c2.carga = 80;
        c2.cor ="Preta";
        c2.modelo = "Pent";
        c2.ponta = 0.7f;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
