/*
 * @author a1094785
 */
public class Circulo extends Elipse{
    
    public Circulo(double r){
        super(r,r);
    }
    
    @Override
    public double getPerimetro(){
        return 2*Math.PI*this.r;
    }
}
