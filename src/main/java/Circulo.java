/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1094785
 */
public class Circulo extends Elipse{
    
    public Circulo(double r){
        super(r,r);
    }
    
    public double getPerimetro(){
        return 2*Math.PI*this.r;
    }
}
