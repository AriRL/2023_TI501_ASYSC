/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author Ari
 */
public class complexNumber {
    private float a;
    private float b;
    
    public complexNumber(){
        
    }
    
    public complexNumber(float a, float b){
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    
    public complexNumber conj(){
        return new complexNumber(this.a, this.b);
    }
    
    public static complexNumber conj(complexNumber z){
        return new complexNumber(z.a, - z.b);
    }
    public complexNumber add(complexNumber z){
        return new complexNumber(this.a + z.a, this.b + z.b);
    }
    
    public complexNumber subs(complexNumber z){
        return new complexNumber(this.a - z.a, this.b - z.b);
    }
    
    public complexNumber mult(complexNumber z){
        return new complexNumber(this.a * z.a - this.b * z.b, 
                                 this.a * z.b + z.a * this.b);
    }
    
    public complexNumber div(complexNumber z){
        complexNumber aux = mult(   conj(z)   );
        float den = z.a*z.a + z.b*z.b;
        
        return new complexNumber( aux.a/den, aux.b/den);
    }
    
    public static float mod(complexNumber z){
        return (float) Math.sqrt(z.a*z.a + z.b*z.b);
    }
    
    public static float angle(complexNumber z){
        return (float) Math.atan2(z.b, z.a);
    }
    
     public  float mod(){
        return (float) Math.sqrt(this.a*this.a + this.b*this.b);
    }
    
    public  float angle(){
        return (float) Math.atan2(this.b, this.a);
    }
    
    public complexNumber toN(int n){
        float m = mod();
        float angle = angle();
        return new complexNumber(
                (float)Math.pow(m, n)* (float)Math.cos(n * angle),
                (float)Math.pow(m, n)* (float)Math.sin(n *angle));
    }

    @Override
    public String toString() {
        return "complexNumber{" + "a=" + a + ", b=" + b + '}';
    }
    
    
  
}
