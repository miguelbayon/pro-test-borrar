import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

public class ClaseParaTestearUsoScannerTestIntellij {

    public void leerArchivo() {
        try {
            File archivo = new File(System.getProperty("user.home") + File.separator + "salida.txt");
            System.out.println(Files.readString(archivo.toPath()));
        }
        catch (NoSuchFileException e) {
            System.out.println("¡Algo ha ido mal!");
            System.out.println("No se ha encontrado el archivo");
        }
        catch (Exception e) {
            System.out.println("¡Algo ha ido mal!");
            System.out.println(e);
        }
    }

    public void escribirAArchivo() {
        try {
            FileWriter fw = new FileWriter(System.getProperty("user.home") + File.separator + "salida.txt");
            fw.write("Linea 1\nLinea 2\nLinea 3");
            fw.close();
        }
        catch (Exception e) {
            System.out.println("Algo salió mal");
            e.printStackTrace();
        }
    }
}
