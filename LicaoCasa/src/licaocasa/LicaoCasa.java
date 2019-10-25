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
public class LicaoCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pia prato1 = new Pia();
        prato1.cor = "preto";
        prato1.comprimento = 15f;
        prato1.limpa = true;
        
        prato1.lavar();
        prato1.limpar();
    }
    
}
