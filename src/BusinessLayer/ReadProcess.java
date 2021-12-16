package BusinessLayer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import PersistenceLayer.Multa;

public class ReadProcess {

    public static void main(String[] args) {
        String ruta = "C:\\Users\\wow80\\Documents\\NetBeansProjects\\taller1_ADS\\src\\DatabaseLayer\\dataVelocimetro.csv";
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
                // System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        /*
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).toString());    
        }
        */

        Collections.sort(data);

        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).toString());    
        }

    }
}
