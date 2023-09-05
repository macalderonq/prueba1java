
package prueba1;

/**
 *
 * @author María José Calderón
 * @version 04/09/2023
 */
public class Validacion {

    public Validacion() {
    }
    
    public boolean validar8digitos(int numero){
        if (numero>10000000 && numero<100000000) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean validarNoVacio(String texto){
        if (texto!=""||texto!=" ") {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean validarPrecioPlan(int precio){
        if (precio>6990) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean validarLetraAntiguedad(char antiguedad){
        if (antiguedad=='N'||antiguedad=='A') {
            return true;
        } else {
            return false;
        }
    }
}
