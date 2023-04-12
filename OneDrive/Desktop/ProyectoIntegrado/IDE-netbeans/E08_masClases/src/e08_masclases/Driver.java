/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e08_masclases;
import e08_inheritance.SportsCar;
import e08_inheritance.Convertible;
/**
 *
 * @author Ari
 */
public class Driver {
    public void doDriver(){
            SportsCar sc = new SportsCar();
            sc.goFast();
            
            Convertible con = new Convertible();
            con.goFast();
    }
    
}
