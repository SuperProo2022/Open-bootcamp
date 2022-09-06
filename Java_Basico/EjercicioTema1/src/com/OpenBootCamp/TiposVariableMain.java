package com.OpenBootCamp;
/*
 * Crear un proyecto java desde cero.
 * Crear un paquete.
 * Dentro del paquete crear una clase.
 * Dentro de la clase crear un método main
 * Imprimir todos los tipos de datos vistos.
 * Tipos de datos mas comunes:
 * int, long, double, boolean, String
 */
public class TiposVariableMain {
    public static void main(String[] args) {

        //Tipos de Datos
        byte personas = 3;
        short monedas = 100;
        int cantidad = 1000;
        long dinero = 10000;
        float metros = 1.9f;
        double precio = 10.6d;
        boolean verdadero = true;
        char letra = 'z';
        String nombre = "Juan";

        //Mostrar el valor por pantalla
        System.out.println("El valor de la variable de tipo byte es: " + personas);
        System.out.println("El valor de la variable de tipo short es: " + monedas);
        System.out.println("El valor de la variable de tipo int es: " + cantidad);
        System.out.println("El valor de la variable de tipo long es: " + dinero);
        System.out.println("El valor de la variable de tipo float es: " + metros);
        System.out.println("El valor de la variable de tipo double es: " + precio);
        System.out.println("El valor de la variable de tipo boolean es: " + verdadero);
        System.out.println("El valor de la variable de tipo char es: " + letra);
        System.out.println("El valor de la variable de tipo String es: " + nombre);
    }
}
