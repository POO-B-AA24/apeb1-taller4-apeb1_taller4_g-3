//Autores: Ricardo Espinosa y Juan Diego Guerrero

import java.util.Scanner;

public class problema_1_ventas {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int seguir = 0;
        int i = 1;
        //NOTA: El ciclo es requerimento extra :)
        do {
            //PEDIR DATOS POR CONSOLA
            System.out.println("**VENTA**" + i);
            System.out.println("Ingresa el nombre del producto");
            String nombre = tc.nextLine();
            System.out.println("Ingrese precio unitario del producto");
            double precio = tc.nextDouble();
            System.out.println("Ingrese cantidad del producto");
            int cantidad = tc.nextInt();

            //DECLARAR OBJETO
            Venta venta = new Venta(nombre, precio, cantidad);

            //INVOCAR METODOS PARA CALCULAR EL PRECIO FINAL
            venta.calcularDescuento(precio, cantidad);
            venta.calcularPrecioFinal(precio, cantidad, venta.getDescuento());

            //MOSTRAR DATOS EM CONSOLA
            System.out.println(venta);
            System.out.println("QUIERES HACER OTRA VENTA( 1->SI | 2->NO )");
            seguir = tc.nextInt();
            if(seguir == 2)
                System.out.println("GRACIAS POR USAR ESTE PROGRAMA :)");
            i++;
        } while (seguir == 1);
    }
}

class Venta {

    //ATRIBUTOS 
    private String nombre;
    private double precioUnit;
    private int cantidad;
    private double descuento;
    private double precioFinal;

    //CONSTRUCTOR
    public Venta(String nombre, double precioU, int cantidad) {
        this.nombre = nombre;
        this.precioUnit = precioU;
        this.cantidad = cantidad;
        this.descuento = 0;
        this.precioFinal = 0;
    }

    //METODOS ESPECIALES
    public void calcularDescuento(double precioU, int cantidad) {
        this.descuento = 0;
        if (precioU < 1000) {
            this.descuento = precioU * (0.05);
        } else if (precioU >= 1000 && cantidad >= 10) {
            this.descuento = precioU * (0.1);
        }
    }

    public void calcularPrecioFinal(double precio, int cantidad, double descuento) {
        this.precioFinal = (precio * cantidad) - descuento;

    }

    @Override
    public String toString() {
        StringBuilder escritor = new StringBuilder();
        escritor.append("VENTA: ");
        escritor.append("NOMBRE = ").append(nombre);
        escritor.append(" | PRECIO UNITARIO = ").append(precioUnit);
        escritor.append(" | # UNIDADES = ").append(cantidad);
        escritor.append(" | DESCUENTO = ").append(getDescuento());
        escritor.append(" | PRECIO FINAL = ").append(getPrecioFinal());
        return escritor.toString();
    }

    //METODOS SETTER & GETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getNombre() {
        return nombre;
    }
    public double getPrecioUnit() {
        return precioUnit;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double getDescuento() {
        return descuento;
    }
    public double getPrecioFinal() {
        return precioFinal;
    }

}
