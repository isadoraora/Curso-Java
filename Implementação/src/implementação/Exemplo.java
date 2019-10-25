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
public class Exemplo {
    private ArrayList <Contato> lista = new ArrayList<Contato>();
    
    public void Incluir(Contato c){
        lista.add(c);
    }
    public void Excluir(int codigo){
        lista.remove(codigo);
    }
    public void Alterar(int codigo){
        lista.set(codigo, new Contato());
    }
    public void Consultar(int codigo){
        lista.get(codigo);
    }

        
}
