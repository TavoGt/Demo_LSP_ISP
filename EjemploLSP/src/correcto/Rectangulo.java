/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcto;

/**
 *
 * @author gtavo
 */
public class Rectangulo implements Forma {
    private int alto;
    private int ancho;
    
    public void setAncho(int ancho) {
        this.ancho= ancho;
    }
    
    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public int cacularArea() {
        return ancho * alto;
    }
    
    
}
