package com.example;
import com.example.controlador.ControladorEstudiante;
import com.example.modelo.Estudiante;
import com.example.vista.VistaEstudiante;
public class Main {
    public static void main(String[] args) {
        System.out.println("Práctica MVC - UNIAJC");
        
        System.out.println("Creando el modelo...");
        Estudiante estudiante = new Estudiante("Juan Pérez", 20);

        System.out.println("Creando la vista...");
        VistaEstudiante vista = new VistaEstudiante();

        System.out.println("Creando el controlador...");
        ControladorEstudiante controlador = new ControladorEstudiante(estudiante, vista);

        System.out.println("Actualizando la vista...");
        controlador.actualizarVista();

        System.out.println("Modificando el modelo...");
        estudiante.setNombre("Juan Pérez Modificado");
        estudiante.setEdad(21);

        System.out.println("Actualizando la vista...");
        controlador.actualizarVista();
    }
}