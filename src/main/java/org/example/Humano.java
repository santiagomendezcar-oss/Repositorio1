package org.example;


public class Humano {
    private String nombre;
    private int edad;


    public Humano() {
    }

    public Humano(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void caminar() {
        // Método a ser sobreescrito por las subclases
    }
}

// Clase Persona 1 que extiende Humano
class Persona1 extends Humano {
    public Persona1(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void caminar() {
        System.out.println(getNombre() + " de " + getEdad() + " años está caminando.");
    }
}

class Persona2 extends Humano {
    public Persona2(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void caminar() {
        System.out.println(getNombre() + " de " + getEdad() + " años está caminando.");
    }
}

// Clase Persona 3 que extiende Humano
class Persona3 extends Humano {
    public Persona3(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void caminar() {
        System.out.println(getNombre() + " de " + getEdad() + " años está caminando.");
    }
}




