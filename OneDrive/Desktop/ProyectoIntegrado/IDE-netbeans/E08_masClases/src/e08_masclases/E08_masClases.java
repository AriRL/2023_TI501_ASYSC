/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e08_masclases;

/**
 *
 * @author Ari
 */
public class E08_masClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Moo moo = Moo();
        
        moo.useZoo();
        
        System.out.pritln(moo);
        
        Moo moo2 = new Moo();
        moo2.useZoo();
        
        System.out.println(moo);
    }
    
}
