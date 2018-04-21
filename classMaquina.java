/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package maquinabebidas;

/**
 *
 * @author nelson
 */
public class classMaquina {
    int stockBebidas = 0;
    int cantidadVendida = 0;
    int precioBebida = 500;

    public void inicializar(
            int stockActual,
            int precioActual) {
      this.stockBebidas = stockActual;
      this.precioBebida = precioActual;
    }

    public void comprar() {
        if (this.stockBebidas > 0) {
            //podemos vender
            this.stockBebidas -= 1;
            this.cantidadVendida += 1;
            System.out.println("Por favor retire su bebida.");
        } else {
            //devolver moneda y avisar
            System.out.println("Lo sentimos, no hay bebidas. Retire su dinero.");
        }
    }

    public int getStockDisponible() {
        return this.stockBebidas;
    }

    public int getDineroRecaudado() {
        return this.cantidadVendida * this.precioBebida;
    }

    public void repararStock(int cantidadNueva) {
        this.stockBebidas = cantidadNueva;
        
    }

}
