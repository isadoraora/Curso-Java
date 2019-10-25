/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacompras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author isa.mdeo
 */
public class ListaCompras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            TreeSet<String> oC = new TreeSet<String>();
            oC.add("Macarrão");
            oC.add("Macarrão");
            oC.add("Alface");
            oC.add("Beringela");
            
            ArrayList <String> oK = new ArrayList <String> ();
            oK.add("macarrão");
            oK.add("macarrão");
            oK.add("alface");
            oK.add("beringela");
            
            System.out.println("SET: "+oC);
            System.out.println("LIST: "+oK);
            
            
           
}
            
            
            
    }
    

