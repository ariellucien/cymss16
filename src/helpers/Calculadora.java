/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author administrador1
 */
public class Calculadora {
    public int suma(int a, int b)
    {
        return a + b;
    }
    public int resta(int a, int b)
    {
        return a - b;
    }
    public int multiplicacion(int a, int b)
    {
        return a * b;
    }
    public int division(int a, int b)
    {
        if(b==0)
            return 0;
        else
        return a / b;
    }    
}
