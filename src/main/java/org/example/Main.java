package org.example;


public class Main {
    public static void main(String[] args) {
        Persona1 persona1 = new Persona1("Juan", 35);
        Persona2 persona2 = new Persona2("María", 28);
        Persona3 persona3 = new Persona3("Pedro", 42);

        persona1.caminar();
        persona2.caminar();
        persona3.caminar();
    }
}