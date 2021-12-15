package BusinessLayer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import PersistenceLayer.Multa;

public class Controlador {

    public static void main(String[] args) {
        String ruta = "/home/castle/Desktop/taller1_ADS/src/DatabaseLayer/dataVelocimetro.csv";
        String line;
        ArrayList<Multa> data = new ArrayList<Multa>();
        // Creación de objeto tipo Multa
        Multa radar;

        // Método de lectura de csv
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))){
            while ((line = br.readLine()) != null) {
                String[] distribucion = line.split(",");
                // Almacenamiento de datos dentro del objeto
                radar = new Multa(Integer.parseInt(distribucion[0].replaceAll("\\D+", "")), distribucion[1], distribucion[2], 
                    distribucion[3], distribucion[4], distribucion[5], distribucion[6], distribucion[7], distribucion[8], 
                    distribucion[9], distribucion[10], distribucion[11]);
                // Ingreso de objetos a Array
                data.add(radar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
