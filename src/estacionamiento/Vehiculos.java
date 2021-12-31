/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import java.sql.Timestamp;

/**
 *
 * @author Lucas
 */
public class Vehiculos {
    
    private int ticket;
    private String tipoVehiculo;
    private String marca;
    private String modelo;
    private String color;
    private String patente;
    private String nombrePropietario;
    private int dniPropietario;
    private Timestamp fechaIngreso;
    
    public Vehiculos(){}
    
    public int getTicket() {
        return this.ticket;
    }
    
    public void setTicket(int ticket) {
        this.ticket = ticket;
    }
    
    public String getTipoVehiculo() {
        return this.tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return this.patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNombrePropietario() {
        return this.nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public int getDniPropietario() {
        return this.dniPropietario;
    }

    public void setDniPropietario(int dniPropietario) {
        this.dniPropietario = dniPropietario;
    }
          
    public Timestamp getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Timestamp fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
