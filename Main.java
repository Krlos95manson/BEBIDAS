/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package maquinabebidas;
import java.util.Scanner;
/**
 *
 * @author nelson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        classMaquina oMaquina = new classMaquina();
        int opcion = 0;
        int cantidadNueva = 0;
        Scanner sc = new Scanner(System.in);
        
        oMaquina.inicializar(100, 500);
        
        while (opcion != 5) {
            System.out.print("Ingrese opción: ");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    oMaquina.comprar();
                    break;
                case 2:
                    System.out.println("El stock disponible es " +
                    oMaquina.getStockDisponible());
                    break;
                case 3:
                    System.out.println("El dinero recaudado es es " +
                    oMaquina.getDineroRecaudado());
                    break;
                case 4:
                    System.out.print("Indique nuevo stock: ");
                    cantidadNueva = sc.nextInt();
                    oMaquina.repararStock(cantidadNueva);
                    break;
            }
        }
        System.out.println("Gracias por operar con nosotros!");

    }

}
