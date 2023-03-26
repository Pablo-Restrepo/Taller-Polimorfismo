/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.tallerpolimorfismo.modelo;

/**
 *
 * @author agred
 */
import java.util.Date;

public class ViajeFamiliar extends Viaje {
    private int familia;

    public ViajeFamiliar(String origen, String destino, int costo, Date fechaDeSalida, Date fechaDeLlegada, int familia) {
        super(origen, destino, costo, fechaDeSalida, fechaDeLlegada);
        this.familia = familia;
    }

    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }

    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }

    // Getters y Setters
    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }
}