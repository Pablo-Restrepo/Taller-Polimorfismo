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

public class ViajeIncentivo extends Viaje {
    private String empresa;

    public ViajeIncentivo(String origen, String destino, int costo, Date fechaDeSalida, Date fechaDeLlegada, String empresa) {
        super(origen, destino, costo, fechaDeSalida, fechaDeLlegada);
        this.empresa = empresa;
    }

    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }

    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }

    // Getters y Setters
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}