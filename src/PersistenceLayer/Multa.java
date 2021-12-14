/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersistenceLayer;

import java.util.Date;

/**
 *
 * @author Grupo Uno 
*/
public class Multa {
    public int id;
    public String date,hour, captura, infraccion, placas, propietario, cedula
            , speed_limit, speed_catch, modelo, color;
    
    public Multa(int id, String date,String hour,String captura, 
            String infraccion, String placas, String propietario, String cedula,
            String speed_limit, String speed_catch, String modelo, String color){
        this.id = id;
        this.date = date;
        this.hour = hour;
        this.captura = captura;
        this.infraccion = infraccion;
        this.placas = placas;
        this.propietario = propietario;
        this.cedula = cedula;
        this.speed_limit = speed_limit;
        this.speed_catch = speed_catch;
        this.modelo = modelo;
        this.color = color;
    }
    
    public Multa (){
        
    }
   
    public void setId(int id){
        this.id = id;
    }
    
    public void setDate( String date ){
        this.date = date;
    }
    
    public void setHour( String hour ){
        this.hour = hour;
    }
    
    public void setCaptura( String captura ){
        this.captura = captura;
    }
    
    public void setInfraccion( String infraccion ){
        this.infraccion = infraccion;
    }
    
    public void setPlacas( String placas ){
        this.placas = placas;
    }
    
    public void setPropietario( String propietario ){
        this.propietario = propietario;
    }
    
    public void setCedula( String cedula ){
        this.cedula = cedula;
    }
    
    public void setSpeed_limit( String speed_limit ){
        this.speed_limit = speed_limit;
    }
    
    public void setSpeed_catch( String speed_catch ){
        this.speed_catch = speed_catch;
    }
    
    public void setModelo( String modelo ){
        this.modelo = modelo;
    }
    
    public void setColor( String color ){
        this.color = color;
    } 
    
}
