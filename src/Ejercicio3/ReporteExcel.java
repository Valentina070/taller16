/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author zunig
 */
public class ReporteExcel implements GeneradorReporte {
@Override
public void generarReporte(String datos) {
        System.out.println("Generando reporte en Excel con los datos: " + datos);
    }
}

