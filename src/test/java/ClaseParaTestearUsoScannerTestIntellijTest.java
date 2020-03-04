import org.junit.Test;

import static org.junit.Assert.*;

public class ClaseParaTestearUsoScannerTestIntellijTest {

    @Test
    public void leerNumeroDesdeTeclado() {
        ClaseParaTestearUsoScannerTestIntellij objetoBase = new ClaseParaTestearUsoScannerTestIntellij();
        objetoBase.escribirAArchivo();
        objetoBase.leerArchivo();
    }
}