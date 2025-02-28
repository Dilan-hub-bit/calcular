/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculararea;

/**
 *
 * @author Sala de Sistemas
 */
public class Area {
    private int Ancho;
    private int Largo;

    /**
     * @return the Ancho
     */
    public int getAncho() {
        return Ancho;
    }

    /**
     * @param Ancho the Ancho to set
     */
    public void setAncho(int Ancho) {
        this.Ancho = Ancho;
    }

    /**
     * @return the Largo
     */
    public int getLargo() {
        return Largo;
    }

    /**
     * @param Largo the Largo to set
     */
    public void setLargo(int Largo) {
        this.Largo = Largo;
    }
    
    public int CalcularArea(int a, int b){
    
    return a*b;
    }
}
