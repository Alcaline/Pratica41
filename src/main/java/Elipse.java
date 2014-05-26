/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1094785
 */
public class Elipse {
    protected double r;
    protected double s;
    
    public Elipse(double r, double s){
        this.r = r;
        this.s = s;
    }
        
    public double getArea(){
        return Math.PI*this.r*this.s;
    }
    
    public double getPerimetro(){
        return Math.PI*(3*(this.r+this.s)-Math.sqrt((3*this.r+this.s)*(3*this.s+this.r)));
    }
    
}
