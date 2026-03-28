package com.example.vista;

import com.example.modelo.Estudiante;

public class VistaEstudiante {

    public void mostrarDetallesEstudiante(Estudiante estudiante) {
        System.out.println("Detalles del Estudiante:");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());

    }
}