package server.side.java;

import java.io.*; //para la lectura y escritura de archivos

public class Textos {
    public void leerUnaLinea(String nombreArchivo) {
        try {
            FileReader r = new FileReader(nombreArchivo);
            BufferedReader buffer = new BufferedReader(r);
            System.out.println(buffer.readLine()); // solamente lee una linea
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void leerTodasLasLineas(String nombreArchivo) {
        try {
            FileReader r = new FileReader(nombreArchivo);
            BufferedReader buffer = new BufferedReader(r);
            String temp = null;
            temp = buffer.readLine();
            while (temp != null) {
                System.out.println(temp);
                temp = buffer.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
