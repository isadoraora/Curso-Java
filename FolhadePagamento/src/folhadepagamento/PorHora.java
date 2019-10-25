/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhadepagamento;

/**
 *
 * @author isa.mdeo
 */
public class PorHora extends Empregado {
    private double valorHora =0.0;
    private int numHora =0;

    public PorHora(String nome, double vhora, int nhora){
        super(nome);
        valorHora=vhora;
        numHora=nhora;
    }

    PorHora(String ana, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumHora() {
        return numHora;
    }

    public void setNumHora(int numHora) {
        this.numHora = numHora;
    }
    
     public double getPay(){
         double pay = valorHora *numHora;
         return pay;
     }
    }

