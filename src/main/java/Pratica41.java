/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica41 {
    public static void main(String[] args) {
        Elipse elip =   new Elipse(2, 4);
        Circulo circ =  new Circulo(2);
        System.out.println("Elipse:\n  Area: "+elip.getArea()+
                            "\n  Perimetro: "+elip.getPerimetro()+
                            "\nCirculo:\n  Area: "+circ.getArea()+
                            "\n  Perimetro: "+circ.getPerimetro());
    }
}
