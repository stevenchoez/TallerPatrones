/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.Date;

/**
 *
 * @author erisi
 */
public class ArticuloTecnologico {
    protected float precio;
    protected int numeroS;
    protected String nombreComercial;
    protected String locacion;
    protected boolean presentaFalla;
    protected Date garantia;

    public ArticuloTecnologico(float precio, int numeroS, String nombreComercial, String locacion, boolean presentaFalla, Date garantia) {
        this.precio = precio;
        this.numeroS = numeroS;
        this.nombreComercial = nombreComercial;
        this.locacion = locacion;
        this.presentaFalla = presentaFalla;
        this.garantia = garantia;
    }
    
}
