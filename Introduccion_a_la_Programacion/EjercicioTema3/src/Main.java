public class Main {
    public static void main(String[] args) {
        //Primera parte:
        //Llamar a la función en el main y darle valores.
        sumarymostrar(3,4,5); //3+4+5=12
        System.out.println(sumarydevolver(3,4,5));//3+4+5=12
        //Segunda parte:
        //Crear un objeto miCoche en el main y añadirle una puerta.
        //Mostrar el número de puertas que tiene el objeto.
        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();
        System.out.println(miCoche.Puertas);
    }
    //Primera parte:
    //Crear una función con tres parámetros que sean números que se suman entre sí.
    public static void sumarymostrar(int valor1, int valor2, int valor3) {

        System.out.println(valor1 + valor2 + valor3);

    }
    public  static  int sumarydevolver(int valor1,int valor2,int valor3){

        return valor1+valor2+valor3;
    }
}
//Segunda parte:
//Crear una clase coche.
//Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
//Una función que incremente el número de puertas que tiene el coche.
class Coche {
    public int Puertas = 0;
    public void IncrementarPuertas(){
        this.Puertas++;
    }
}
