
package com.OpenBootCamp;
//import java.util.Scanner;

//En este ejercicio tenéis que crear un bucle que permita concatenar textos
//e imprima el resultado final por consola.
//Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
//String[] nombres = {"", "", "", ""}

public class BuclesMain {
    public static void main(String[] args) {
        String[] nombres = {"Jorge,", "Adrian,", "Pablo,", "Paula"};
        String texto = "";
        for(String nombre : nombres){
            texto.append(nombre);
        }
        System.out.println("El texto concatenado es : "+ texto);
    }
}
 /*   public static void main(String[] args) {
        int size = 3;
        String[] textos= new String[size];
        cargarTexto(textos);
        String textConcat =  concatenarTexto(textos);
        System.out.println("El texto concatenado es : "+ textConcat);
    }
    public static void cargarTexto(String[] texts){
        for(int i = 0; i < texts.length; i++){
            System.out.println("introduce un texto : ");
            Scanner cargar = new Scanner(System.in);
            texts[i] = cargar.nextLine();
        }
    }
    public static String concatenarTexto(String[] texts){
        String concat = "";
        for(int i = 0; i < texts.length; i++){
           if(i==0){
               concat += texts[i];
           }
           else{
               concat += " "+texts[i];
           }
        }
        return concat;
}*/
