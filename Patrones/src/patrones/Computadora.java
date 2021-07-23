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
public class Computadora extends ArticuloTecnologico{
    public Computadora(float precio, int numeroS, String nombreComercial, String locacion, boolean presentaFalla, Date garantia){
        super(precio, numeroS, nombreComercial, locacion, presentaFalla, garantia);
        /**
         * Argumentos adicionales de cada articulo
         */
    }
}
