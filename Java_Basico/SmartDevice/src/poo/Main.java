package poo;

public class Main {
    public static void main(String[] args) {
        SmartPhone celular = new SmartPhone("A12","negro","4g","android","4ram","121435464");

        SmartWatch reloj = new SmartWatch ("Innjoo","azul","5g",3.5,true,true,true);

        System.out.println("El smartphone es : "+ celular + "\nEl smartWatch es: "+ reloj );
    }
}
