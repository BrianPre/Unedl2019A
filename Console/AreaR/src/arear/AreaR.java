/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arear;

import java.util.Scanner;

/**
 *
 * @author Ovni
 */
public class AreaR {
    
    protected float base;
    protected float lado;
    protected float area;
    protected Scanner teclado;
    
    public void area(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base en cm:");
        base = teclado.nextFloat();
        System.out.println("Ingrese el valor de el lado en cm:");
        lado = teclado.nextFloat();
        
        area = base * lado;
        
    }

}
