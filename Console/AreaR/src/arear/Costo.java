/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arear;

/**
 *
 * @author Ovni
 */
public class Costo extends AreaR {
    
    protected float costo;
    protected float total;
    
    
    public void calcular(){
        
        System.out.println("Ingrese el costo en pesos por cm2 de la mesa:");
        costo = teclado.nextFloat();
        
        total = costo * area;
        
        System.out.println("\n*** El costo de la mesa es de: "+total+" pesos.");
    }
    
}
