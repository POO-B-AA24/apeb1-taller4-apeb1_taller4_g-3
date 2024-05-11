import java.util.ArrayList;
import java.util.Scanner;
public class Problema_2_Ejecutor {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String bandera = "si";
        ArrayList<Problema_2_EmpleadoBase> empleados = new ArrayList<>();
        System.out.println("Ingrese los empleados");
        while (true) {
            System.out.print("Nombre: ");
            String nombre = tc.next();
            System.out.print("Salario: ");
            double salario = tc.nextDouble();
            System.out.print("Edad: ");
            int edad = tc.nextInt();
            Problema_2_EmpleadoBase empleado = new Problema_2_EmpleadoBase(nombre, salario, edad);
            empleados.add(empleado);
            System.out.println("");
            System.out.println("Desea continuar ingresando [si][no]");
            bandera = tc.next();
            if (bandera.equals("no")) {
                break;
            }
        }
        System.out.println(" ");
        System.out.println("Desea hacer un aumento de salario [si][no]");
        bandera = tc.next();
        if (bandera.equals("si")) {
            Problema_2_EmpleadoBase.calcularAumentoSalario(empleados);
        }
        Problema_2_EmpleadoBase.mostrarInformacion(empleados);
    }
}
