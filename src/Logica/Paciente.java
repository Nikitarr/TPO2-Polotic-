
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Paciente implements Serializable {
 //variables   
    @Id
    private int numCliente;
    @Basic
    private String nombreMascota;
    private String raza;
    private String color;
    private String alergias;
    private String atencion;
    private String nombreDueno;
    private int celDueno;
    private String obser;
    
    
//métodos   
    public Paciente crearRegistro(){
        return new Paciente();
    }
            
//constructores

    public Paciente() {
    }
    
    public Paciente(int numCliente, String nombreMascota, String raza, String color, String alergias, String atencion, String nombreDueno, int celDueno, String obser) {
        this.numCliente = numCliente;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.color = color;
        this.alergias = alergias;
        this.atencion = atencion;
        this.nombreDueno = nombreDueno;
        this.celDueno = celDueno;
        this.obser = obser;
    }
    
//getters y setters

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getAtencion() {
        return atencion;
    }

    public void setAtencion(String atencion) {
        this.atencion = atencion;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public int getCelDueno() {
        return celDueno;
    }

    public void setCelDueno(int celDueno) {
        this.celDueno = celDueno;
    }

    public String getObser() {
        return obser;
    }

    public void setObser(String obser) {
        this.obser = obser;
    }

    @Override
    public String toString() {
        return  "numCliente=" + numCliente + ", nombreMascota=" + nombreMascota + ", raza=" + raza + ", color=" + color + ", alergias=" + alergias + ", atencion=" + atencion + ", nombreDueno=" + nombreDueno + ", celDueno=" + celDueno + ", obser=" + obser ;
    }
    
   
}
