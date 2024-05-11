import java.util.ArrayList;
import java.util.Scanner;
public class Problema_2_EmpleadoBase {
    public static Scanner tc = new Scanner(System.in);
    private String nombre;
    private double salario;
    private int edad;
    public Problema_2_EmpleadoBase(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public static void calcularAumentoSalario(ArrayList<Problema_2_EmpleadoBase> empleados) {
        double salarioTotal = 0;
        for (Problema_2_EmpleadoBase empleado : empleados) {
            salarioTotal += empleado.getSalario();
        }
        double salarioPromedio = salarioTotal / empleados.size();
        System.out.print("Ingrese el porcentaje de aumento del salario: ");
        double porcentaje = tc.nextDouble();
        for (Problema_2_EmpleadoBase empleado : empleados) {
            if (empleado.getSalario() < salarioPromedio) {
                double aumento = empleado.getSalario() * (porcentaje / 100);
                System.out.print("------------------------------------------\n");
                System.out.printf("Aumento de salario de %.2f para: %s\n", aumento, empleado.getNombre() );
                System.out.printf("Salario anterior: %.2f\n", empleado.getSalario());
                empleado.setSalario(empleado.getSalario() + aumento);
                System.out.printf("Salario nuevo: %.2f\n", empleado.getSalario());
            }
        }
    }
    public static void mostrarInformacion(ArrayList<Problema_2_EmpleadoBase> empleados) {
        System.out.print("------------------------------------------\n");
        for (Problema_2_EmpleadoBase empleado : empleados) {
            System.out.printf("Nombre: %s | Salario: %.2f | Edad: %d |\n", empleado.getNombre(), empleado.getSalario(), empleado.getEdad());
        }
    }
}