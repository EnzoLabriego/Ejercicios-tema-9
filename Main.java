public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(29, "Paco", "658124596", 400.0);
        cliente.mostrarCliente();
        System.out.println();

       
        Trabajador trabajador = new Trabajador(26, "Marta", "663541712", 2154.0);
        trabajador.mostrarTrabajador();
    }
}

class Persona {
    protected int edad;
    protected String nombre;
    protected String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public void mostrarCliente() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Crédito: " + credito);
    }
}

class Trabajador extends Persona {
    private double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public void mostrarTrabajador() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Salario: " + salario);
    }
}
