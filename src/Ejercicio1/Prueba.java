/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author zunig
 */
public class Prueba {
 public static void main(String[] args) {
ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
GestorAutenticacion gestorAutenticacion = new GestorAutenticacion(autenticacionLocal);
gestorAutenticacion.gestorAutenticacion("valentina", 10005);
 }}       