

import incorrecto.Cuadrado;
import org.junit.Assert;
import org.junit.Test;

public class LiskovTest {

    @Test
    public void testArea() {
        Cuadrado r = new Cuadrado();
        r.setAlto(5);
        r.setAncho(4);
        Assert.assertEquals(20, r.calcularArea());
    }
}
