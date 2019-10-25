/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licaocasa;

/**
 *
 * @author isa.mdeo
 */
public class Pia {
    float largura;
    float comprimento;
    boolean limpa;
    boolean cheia;
    String cor;
    
    void lavar (){
        if (this.limpa==false){
            System.out.println("Vai lavar os pratos");
        } else {
            System.out.println("Parabéns pela limpeza");
        }
    }
        void limpar(){
            System.out.println("Estou limpando a pia e os pratos");
        }
        
}
