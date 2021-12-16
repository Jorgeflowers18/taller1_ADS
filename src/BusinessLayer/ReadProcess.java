package BusinessLayer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import PersistenceLayer.Multa;

public class ReadProcess {

    public static void main(String[] args) {
        // String ruta = "C:\\Users\\wow80\\Documents\\NetBeansProjects\\taller1_ADS\\src\\DatabaseLayer\\dataVelocimetro.csv";
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
                    distribucion[3], distribucion[4], distribucion[5], distribucion[6], distribucion[7], 
                    Integer.valueOf(distribucion[8]), Integer.valueOf(distribucion[9]), distribucion[10], distribucion[11]);
                // Ingreso de objetos a Array
                data.add(radar);
                // System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(data, Comparator.comparing(Multa::getSpeedCatch));

        // data.forEach(System.out::println);
    }
}
