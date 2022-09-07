package poo;

public class SmartWatch extends SmartDevice{
    double pulgadas;
    boolean resistenciaAgua;
    boolean bluetooth;
    boolean tactil;

    public SmartWatch(){}
    public SmartWatch(String modelo, String color, String wifi,double pulgadas,boolean resistenciaAgua,boolean bluetooth,boolean tactil){
        super(modelo, color, wifi);
        this.pulgadas = pulgadas;
        this.resistenciaAgua = resistenciaAgua;
        this.bluetooth = bluetooth;
        this.tactil = tactil;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "pulgadas=" + pulgadas +
                ", resistenciaAgua=" + resistenciaAgua +
                ", bluetooth=" + bluetooth +
                ", tactil=" + tactil +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", wifi='" + wifi + '\'' +
                '}';
    }
}

