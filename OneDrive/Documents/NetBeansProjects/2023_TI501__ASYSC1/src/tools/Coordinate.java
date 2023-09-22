
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author Ari
 */

public class Coordinate {
    public static final float XMIN = -20.0f;
    public static final float YMIN = 20.0f;
    public static final float XMAX = -20.0f;
    public static final float YMAX = 20.0f;
    
    public static final float XSCR = 300;
    public static final float YSCR = 300;
    
    public static int toScreenX(float x){
       // return (int)(x * XSCR / YSCR);
       return (int) ((x - XMIN) * XSCR / (XMAX - XMIN));
    }
    
    public static int toScreenY(float y){
        //return (int)((XMAX - y) * YSCR / YMAX);
        return (int) ((y - YMAX) * XSCR / (YMIN - YMAX));
    }
    
}
