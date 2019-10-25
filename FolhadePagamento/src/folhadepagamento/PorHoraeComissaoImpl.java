/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhadepagamento;


public class PorHoraeComissaoImpl extends PorHoraeComissao {

    public PorHoraeComissaoImpl(String nome, double vhora, int nhora, double s) {
        super(nome, vhora, nhora, s);
    }

    @Override
    public void setVendas(double vendas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
