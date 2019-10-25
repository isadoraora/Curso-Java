/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula021;

/**
 *
 * @author isa.mdeo
 */
public class Aula021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ResponderEmail r1 = new ResponderEmail();
        r1.detalhado = "Sim";
        r1.formal = "Sim";
        r1.linhas = 57;
        r1.longo = false;
        r1.ler();
        r1.digitar();
        r1.enviar();
    }
    
}
