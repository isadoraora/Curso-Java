/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstratas;

/**
 *
 * @author isa.mdeo
 */
public class CalculadoraCientifica extends Calculadora implements Visor{
    public CalculadoraCientifica (double px, double py){
        super(px,py);
    }
    public CalculadoraCientifica(){
}
    public double raizquadrada(double x){
        return Math.sqrt(x);
    }
    public double potenciacao(double base, double expoente){
        return Math.pow(base, expoente);
    }
    @Override
    public void mostrar(double resultado){
        System.out.println(resultado);
    }

    @Override
    public void x(){
}}