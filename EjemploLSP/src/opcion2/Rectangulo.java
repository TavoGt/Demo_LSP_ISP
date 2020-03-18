package opcion2;

public class Rectangulo {
    private final int alto;
    private final int ancho;
    
    public Rectangulo(int ancho, int alto) {
        this.ancho= ancho;
        this.alto = alto;
    }
    
    public int calcularArea() {
        return ancho * alto;
    }
}
