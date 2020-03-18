package incorrecto;

public class Rectangulo {
    private int alto;
    private int ancho;
    
    public void setAncho(int ancho) {
        this.ancho= ancho;
    }
    
    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public int calcularArea() {
        return ancho * alto;
    }
}
