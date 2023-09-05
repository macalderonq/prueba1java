
package prueba1;

/**
 *
 * @author María José Calderón
 * @version 04/09/2023
 */
public class Plan {
    
    private int numero,minutos;
    private float precio;
    private String nombre;
    private Cliente cliente;

    public Plan() {
    }

    public Plan(int numero, int minutos, float precio, String nombre, Cliente cliente) {
        this.numero = numero;
        this.minutos = minutos;
        this.precio = precio;
        this.nombre = nombre;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Plan{" + "numero=" + numero + ", minutos=" + minutos + ", precio=" + precio + ", nombre=" + nombre + ", cliente=" + cliente + '}';
    }

    
    
    public void mostrarInformacion(){
        String antiguedadCliente;
        if (this.cliente.getAntiguedad()=='N') {
            antiguedadCliente="Nuevo";
        } else {
            antiguedadCliente="Antiguo";
        }
        
        System.out.println("------INFORMACION PLAN------");
        System.out.println("Numero: "+this.numero);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Minutos: "+this.minutos);
        System.out.println("Precio: $"+this.precio);
        System.out.println("Rut cliente: "+this.cliente.getRut());
        System.out.println("Nombre liente: "+this.cliente.getNombre());
        System.out.println("Dirección ciente: "+this.cliente.getDireccion());
        System.out.println("Correo cliente: "+this.cliente.getCorreo());
        System.out.println("Antiguedad cliente: "+antiguedadCliente);
        System.out.println("----------------------------");
    }
    
    public float aplicarDescuento(float descuentoIngresado){
        if ((this.precio>=20000)||(this.cliente.getAntiguedad()=='N')) {
            this.precio=this.precio-(this.precio*(descuentoIngresado/100));
        }
        return this.precio;
    }
    
    public int agregarMinutos(int minutosIngresados){
        this.minutos=this.minutos+minutosIngresados;
        return this.minutos;
    }
}
