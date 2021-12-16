/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersistenceLayer;

/**
 *
 * @author Grupo Uno 
 * @members -> @edgarguamo @Jorgeflowers18 @vysery98
 * 
*/
public class Multa implements Comparable<Multa> {
    public int id;
    public String date, hour, captura, infraccion, placas, propietario, cedula,
        speed_limit, speed_catch, modelo, color;
    
    public Multa(int info, String date,String hour,String captura, 
            String infraccion, String placas, String propietario, String cedula,
            String speed_limit, String speed_catch, String modelo, String color){
        this.id = info;
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
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the hour
     */
    public String getHour() {
        return hour;
    }

    /**
     * @return the captura
     */
    public String getCaptura() {
        return captura;
    }

    /**
     * @return the infraccion
     */
    public String getInfraccion() {
        return infraccion;
    }

    /**
     * @return the placas
     */
    public String getPlacas() {
        return placas;
    }

    /**
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @return the speed_limit
     */
    public String getSpeedLimit() {
        return speed_limit;
    }

    /**
     * @return the speed_catch
     */
    public String getSpeedCatch() {
        return speed_catch;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
        return "Multa [id: "+ getId() + "\nhour: "+getHour()+"\ncaptura: " + 
                getCaptura()+"\ninfraccion: " + getInfraccion()+ "\nplacas: " 
                + getPlacas()+"\npropietario" + getPropietario()+ "\ncedula: "
                +getCedula() +"\nspeed limit: "+getSpeedLimit()+"\nSpeed Catch: " 
                + getSpeedCatch()+"\ncedula: "+getCedula()+ "\nmodelo: "
                +getModelo()+"\nColor:"+getColor()+"]\n" ;
    }

    @Override
    public int compareTo(Multa other) {
        int compareSpeedCatch = this.getSpeedCatch().compareTo(other.getSpeedCatch());
        
        return compareSpeedCatch;
    }
}
