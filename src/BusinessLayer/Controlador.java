package BusinessLayer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import PersistenceLayer.Multa;

public class Controlador {
    Multa radar;
    // String ruta = " "D:\\ISO-Codes.csv";
    
    String ruta = "../DatabaseLayer/db_velocimetro.csv";
    String separador = ",";
    String [] info;

    CSVReader data = new CSVReader(new FileReader(ruta));
    
    while( (info = data.readNext()) != null) {
        radar = new Multa(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], info[5],
        info[6], info[7], info[8], info[9], info[10], info[11]);
    }

    data.close();
}
    
    
   
    
    
    

