/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmofísica;

import java.util.Scanner;

/**
 *
 * @author Julieth
 */
public class AlgoritmoFísica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double k1 = 0;
        double k2 = 0;
        double mo = 9.1091;
        double c = 299792458;
        int n=0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese F que es igual a F=V/C: ");
        double f = reader.nextDouble();
        System.out.println("Cuantos datos desea operar:");
        int numero=reader.nextInt();
        for (int j = 0; j < numero; j++) {
            System.out.println("Ingrese N representa el número de terminos: ");
            n = reader.nextInt();
            double v = f*c;
            double s = 0;
            double s1= 1;
            for (int i = 1; i <= n; i++) {
                s1 = s1*(i-0.5)/i*(Math.abs(Math.pow(f, 2)));
                s=s+s1;            
            }
        k1 = mo*Math.pow(c, 2)*s;
        k2 = (mo*(Math.abs((Math.pow(v, 2)))))/2;
        System.out.println("\t"+" V/C        REL KE_JOULES            CL KE_JOULES            % DIFF         NO. TERMS   ");
        System.out.println("\t"+f+"   "+k1+"   "+k2+"   "+(100*(k1-k2)/k2)+"      "+n);
        }
    }    
}
