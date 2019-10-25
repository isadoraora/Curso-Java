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
public class ResponderEmail {
    
    String detalhado;
    String formal;
    int linhas;
    boolean longo;
    void status(){
        if (this.longo == true){
            System.out.println("Vai demorar um pouco");
        } else{
            System.out.println("rapidex");
        }
    }
    void responder(){
        System.out.println("Resposta sendo enviada");
    }
    void ler(){
        System.out.println("Lendo o e-mail");
    }
    void digitar(){
        System.out.println("Escrevendo minha resposta");
    }
    void enviar (){
        System.out.println("E-mail sendo enviado "+this.formal);
    }
}
