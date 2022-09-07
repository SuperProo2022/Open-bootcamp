package poo;

public class SmartPhone extends SmartDevice{
    String sistema;
    String ram;
    String IMEI;

    public SmartPhone() {
    }
    public SmartPhone(String modelo,String color,String wifi,String sistema,String ram,String IMEI){
        super(modelo,color,wifi);
        this.sistema = sistema;
        this.ram = ram;
        this.IMEI = IMEI;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "sistema='" + sistema + '\'' +
                ", ram='" + ram + '\'' +
                ", IMEI='" + IMEI + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", wifi='" + wifi + '\'' +
                '}';
    }
}
