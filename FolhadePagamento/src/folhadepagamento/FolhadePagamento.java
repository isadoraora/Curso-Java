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
public class FolhadePagamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empregado lista[] = new Empregado[10];
        lista[0] = new PorComissao("Isa");
        lista[1]= new PorHora("Ana", 20.0);
        lista[2]= new PorHoraeComissao("Pedro",10.0,300) {
            @Override
            public void setVendas(double vendas) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        ((Commission)lista[0]).setVendas(25000);
        ((Commission)lista[2]).setVendas(10000);
        int i=0;
        lista[i].printPay();
        
    
    }
    

}