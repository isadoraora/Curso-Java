/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementação;

import java.util.ArrayList;

/**
 *
 * @author isa.mdeo
 */
public class Implementação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> oList = new ArrayList <String>();
        
        oList.add("String 1");
        oList.add("String 2");
        oList.add(1, "String 3");
        
        for (int i=0; i<oList.size();i++){
            System.out.println(oList.get(i));
        }
        
    }
    
}
