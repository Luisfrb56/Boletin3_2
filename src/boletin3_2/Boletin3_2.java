
package boletin3_2;

import java.util.Scanner;


public class Boletin3_2 {

    public static void main(String[] args) {
    Satelite numero1=new Satelite();
 Scanner sc=new Scanner(System.in);
        System.out.println("Dime el meridiano ");
        double m=sc.nextDouble();
        System.out.println("Dime el paralelo ");
        double p=sc.nextDouble();
        System.out.println("Dime la Distancia a la Tierra ");
        double d=sc.nextDouble();
        numero1.verPosicion();
        Satelite numero2=new Satelite(m,p,d);
        numero2.verPosicion();
    }
    
}
