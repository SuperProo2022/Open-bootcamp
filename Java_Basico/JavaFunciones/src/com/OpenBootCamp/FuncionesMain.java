package com.OpenBootCamp;
/*
Para este ejercicio tendréis que crear una función que reciba un precio
y devuelva el precio con el IVA incluido.
 */
public class FuncionesMain {
    public static void main(String[] args) {
        double precio = 10552.9;
        double valorIva = incluirIva(precio);
        System.out.println("El valor del precio es: "+precio+" y con el iva incluido es: "+valorIva);

    }

    public static double incluirIva(double valor){
        //devuelve el precio + un 24% del iva
        return valor*1.24;
    }
}
