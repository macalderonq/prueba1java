
package prueba1;

import java.util.Scanner;

/**
 *
 * @author María José Calderón
 * @version 04/09/2023
 */
public class Principal {
    public static void main(String[] args) {
        //crearPlan y Cliente
        int numero,minutos,precio;
        String nombrePlan,nombreCliente,rut,direccion,correo;
        boolean flag;
        char antiguedad;
        //aplicarDescuento
        float descuentoIngresado,precioAnterior,precioConDescuento;
        Scanner leer = new Scanner (System.in);
        
        Cliente cliente1 = new Cliente("","","","",' ');
        Plan plan1 = new Plan(0,0,0,"",cliente1);
        Validacion validacion = new Validacion();
        
        System.out.println("---CREAR PLAN---");
        do {
            System.out.println("Ingrese el numero: ");
            numero=leer.nextInt();
            flag=validacion.validar8digitos(numero);
            if (flag==true) {
                plan1.setNumero(numero);
            } else {
                System.out.println("El numero del plan debe tener 8 digitos");
            }
        } while (flag==false);
        do {
            System.out.println("Ingrese el nombre del plan");
            nombrePlan=leer.next();
            flag=validacion.validarNoVacio(nombrePlan);
            if (flag==true) {
                plan1.setNombre(nombrePlan);
            } else {
                System.out.println("El nombre del plan no debe estar vacío");
            }
        } while (flag==false);
        System.out.println("Ingrese los minutos del plan");
        minutos=leer.nextInt();
        plan1.setMinutos(minutos);
        do {
            System.out.println("Ingrese el precio del plan");
            precio=leer.nextInt();
            flag=validacion.validarPrecioPlan(precio);
            if (flag==true) {
                plan1.setPrecio(precio);
            } else {
                System.out.println("El precio debe ser mayor a $6.990");
            }
        } while (flag==false);
        System.out.println("Ingrese el rut del cliente");
        rut=leer.next();
        plan1.getCliente().setRut(rut);
        do {
            System.out.println("Ingrese el nombre del cliente");
            nombreCliente=leer.next();
            flag=validacion.validarNoVacio(nombreCliente);
            if (flag==true) {
                cliente1.setNombre(nombreCliente);
            } else {
                System.out.println("El nombre del cliente no debe estar vacío");
            }
        } while (flag==false);
        System.out.println("Ingrese la direccion del cliente");
        direccion=leer.next();
        plan1.getCliente().setDireccion(direccion);
        System.out.println("Ingrese el correo del cliente");
        correo=leer.next();
        plan1.getCliente().setCorreo(correo);
        do {
            System.out.println("Ingrese si el cliente es nuevo (N) o antiguo (A)");
            antiguedad=leer.next().charAt(0);
            flag=validacion.validarLetraAntiguedad(antiguedad);
            if (flag==true) {
                plan1.getCliente().setAntiguedad(antiguedad);
            } else {
                System.out.println("Debe ingresar 'N' si es nuevo o 'A' si es antiguo");
            }
        } while (flag==false);
        
        plan1.mostrarInformacion();
        
        System.out.println("Ingrese el % de descuento que desea aplicar: ");
        precioAnterior=plan1.getPrecio();
        descuentoIngresado=leer.nextInt();
        precioConDescuento=plan1.aplicarDescuento(descuentoIngresado);
        plan1.setPrecio(precioConDescuento);
        
        System.out.println("----DESCUENTO APLICADO----");
        System.out.println("Precio inicial: $"+precioAnterior);
        System.out.println("Descuento: "+descuentoIngresado+"%");
        System.out.println("Precio actual: $"+plan1.getPrecio());
        
    }
}
