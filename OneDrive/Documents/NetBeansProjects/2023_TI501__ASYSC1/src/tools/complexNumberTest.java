/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author Ari
 */
public class complexNumberTest {
    public static void main (String...args){
        complexNumber a0= new complexNumber (-1, 2);
        complexNumber a1= new complexNumber (4, 0);
        complexNumber a2= new complexNumber (1, -1);
        complexNumber a3= new complexNumber (2, -1);
        complexNumber a4= new complexNumber (1, 1);
        
        complexNumber a0_2 = a0.toN(2);
        complexNumber div0 = a1.div(a2);
        complexNumber div1 =a3.div(a4);
        complexNumber suma = div0.add(div1);
        complexNumber TP01_P1 = a0_2.mult(suma);
        
        System.out.println("TP01_P1: " + TP01_P1.getA() + " + " +TP01_P1.getB() + "i");
    }
}
