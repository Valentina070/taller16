/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author zunig
 */
public class GestorReportes {
    private GeneradorReporte generadorReporte;

   public GestorReportes(GeneradorReporte generadorReporte) {
       this.generadorReporte = generadorReporte;
    }
   public void setGeneradorReporte(GeneradorReporte nuevoGeneradorReporte) {
       this.generadorReporte = nuevoGeneradorReporte;
    }
   public void generar(String datos) {
       generadorReporte.generarReporte(datos);
    }
}

