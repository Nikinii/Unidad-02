/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.unidad02;

/**
 *
 * @author Niko
 */
public class Atencion {
    localdate fecha;
    String Veterinario;
    double costo;
    Mascota mascota;
    int cantidadRecetasl;
    Receta[] recetalist;

    public localdate getFecha() {
        return fecha;
    }

    public String getVeterinario() {
        return Veterinario;
    }

    public double getCosto() {
        return costo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public int getCantidadRecetasl() {
        return cantidadRecetasl;
    }

    public Receta[] getRecetalist() {
        return recetalist;
    }
}
