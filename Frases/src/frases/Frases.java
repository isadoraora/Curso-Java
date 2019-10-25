/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frases;

import java.util.TreeSet;

/**
 *
 * @author isa.mdeo
 */
public class Frases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<String> armazena = new TreeSet<String>();
        String frase = "Se eu peco é na vontade de ter um amor de verdade";
        
        String vetor []= frase.split("");
        int palavras =0;
        
            for(int i=0; i<vetor.length;i++){
                if(armazena.contains(vetor[i])){
                    palavras++;
                    System.out.println(vetor[i]);
                }
                else
                    armazena.add(vetor[i]);
            }
            System.out.println(palavras);
    }
    
}
