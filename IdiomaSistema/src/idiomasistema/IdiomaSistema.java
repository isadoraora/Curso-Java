/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author isa.mdeo
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale idioma =  Locale.getDefault();
        System.out.println("Seu computador está no idioma: ");
        System.out.println(idioma.getDisplayLanguage());
        // TODO code application logic here
    }
    
}
