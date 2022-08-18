public class Main {
    //En este ejercicio practicarás las estructuras de control, para ello deberás crear:
    //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    //Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
    //Crea un bucle While, este bucle tendrá que tener como condición
    // que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
    //Incrementar el valor de la variable en uno cada vez que se ejecute.
    //Mostrarlo por pantalla cada vez que se ejecute.
    //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se
    // debe ejecutar una vez.
    //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0
    // y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor
    // cada vez que se ejecute y deberá mostrarse por pantalla.
    //Por último, para el Switch, deberás crear la variable estacion, y distintos case
    // para las cuatro estaciones del año. Dependiendo del valor de la variable estacion
    // se deberá mandar un mensaje por consola informando de la estación en la que está.
    // También habrá que poner un default para cuando el valor de la variable no sea una estación.
    public static void main(String[] args) {
        System.out.println("Ciclo If");
        int numeroif = 0;
        if(numeroif>0){
           System.out.println("El numero es Positivo");
        }
        else if(numeroif<0){
           System.out.println("El numero es Negativo");
        }
        else {
            System.out.println("Es numero es 0");
        }
        System.out.println("Ciclo While");
        int numerowhile = 0;
        while (numerowhile<3){
           System.out.println(numerowhile);
           numerowhile=numerowhile+1;
       }
        System.out.println("Ciclo Do While");
       do{
           System.out.println(numerowhile);
           numerowhile=numerowhile+1;
       }while (numerowhile<3);
        System.out.println("Ciclo For");
       for (int numerofor=0;numerofor<3;numerofor++){
           System.out.println(numerofor);
       }
        System.out.println("Dentro del Switch");
       var estacion = "INVIERNO";
       switch (estacion){
           case "VERANO":
               System.out.println("La estacion es Verano ");
               break;
           case "INVIERNO":
               System.out.println("La estacion es Invierno");
               break;
           case "OTOÑO":
               System.out.println("La estacion es Otoño");
               break;
           case "PRIMAVERA":
               System.out.println("La estacion es Primavera");
               break;
           default:
               System.out.println(estacion);
       }
    }
}