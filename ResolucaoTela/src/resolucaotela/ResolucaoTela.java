/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author isa.mdeo
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toolkit tela = Toolkit.getDefaultToolkit();
          Dimension d = tk.getScreenSize();
          System.out.println("Screen width = " + d.width);
          System.out.println("Screen height = " + d.height);
     
        
        // TODO code application logic here
    }
    
}
