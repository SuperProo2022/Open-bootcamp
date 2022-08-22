//Crea una clase Persona con las siguientes variables:
//La edad
//El nombre
//El teléfono
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
// esta nueva clase tendrá la variable credito solo para esa clase.
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
// el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
// y con una variable salario que solo tenga la clase Trabajador.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(35);
        cliente.setNombre("Rodolfo");
        cliente.setTelefono("3804656545");
        cliente.setCredito(360.23);
        System.out.println("Soy cliente y me llamo : "+cliente.getNombre());
        System.out.println("Mi edad es : "+cliente.getEdad());
        System.out.println("Mi telefono es : "+cliente.getTelefono());
        System.out.println("Mi credito es : "+cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(40);
        trabajador.setNombre("Alberto");
        trabajador.setTelefono("3804044225");
        trabajador.setSalario(600000);
        System.out.println("\nSoy trabajador y me llamo : "+trabajador.getNombre());
        System.out.println("Mi edad es : "+trabajador.getEdad());
        System.out.println("Mi telefono es : "+trabajador.getTelefono());
        System.out.println("Mi Salario es : "+trabajador.getSalario());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private  String telefono;
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona{
    private double credito;
    public void setCredito(double credito) {
        this.credito = credito;
    }
    public double getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona{
    private  double salario;
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }

}