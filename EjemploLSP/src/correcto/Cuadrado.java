package correcto;

public class Cuadrado implements Forma{
    private int tamanio;
    
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public int cacularArea() {
        return tamanio * tamanio;
    }
    
    
}
