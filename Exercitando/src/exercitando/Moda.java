/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercitando;

/**
 *
 * @author isa.mdeo
 */
public class Moda {
    private char g;
    private double temp;
    
    public void DicaModa(){
        if(g=='f'||temp>19){
            System.out.println("Está quente, use saia");
            if(g=='m'||temp>19){
                System.out.println("Está quente, use berma");
            }else
                System.out.println("Está frio");
    }
    }
}

