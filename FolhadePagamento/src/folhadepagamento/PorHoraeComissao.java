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
public abstract class PorHoraeComissao extends PorHora implements Commission{
    private final double sales = 0.0;

    public PorHoraeComissao(String nome, double vhora, int nhora, double s) {
        super(nome,vhora,nhora);
        setVendas(s);
        
    }

    

    @Override
    public double getPay(){
        double pay = getValorHora() * getNumHora()+ comission_rate* sales;
        return pay;
    }
    public void printPay(){
        super.printPay();
        System.out.printf("Ganho por hora : %8.2f\n", getValorHora()*getNumHora());
        System.out.printf("Ganho por comissao: %8.2f \n", comission_rate*sales);
        
    }
        
  
    }
    

