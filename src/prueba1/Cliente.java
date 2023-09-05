
package prueba1;

/**
 *
 * @author María José Calderón
 * @version 04/09/2023
 */
public class Cliente {
    
    private String rut,nombre,direccion,correo;
    private char antiguedad; 

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String direccion, String correo, char antiguedad) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.antiguedad = antiguedad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public char getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(char antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", direccion=" + direccion + ", correo=" + correo + ", antiguedad=" + antiguedad + '}';
    }

    
   
    
    
}
