package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// crear una persona desde el constructor vacio

        Persona p1 = new Persona();
        p1.setNombre("Juan");
        p1.setEdad(26);
        p1.setGenero("Masculino");

        //crear constructor con todos los parametros
        Persona p2 = new Persona("Juliana", 23, "Femenino");
        //Mostrar persona
        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}