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
public class PorComissao extends Empregado implements Commission {
    private double sales =0.0;

    public PorComissao(String n) {
        super(n);
    }
    
    public PorComissao (String n, double s){
        super(n);
        setVendas(s);
    }

    public void setVendas(double sales) {
        this.sales = (sales<0)?0.0:sales;
    }
        public double getPay(){
            double pay = comission_rate*sales;
            return pay;
        }
    
    }
    

