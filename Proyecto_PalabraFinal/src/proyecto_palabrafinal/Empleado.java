
package proyecto_palabrafinal;


public class Empleado extends Persona { // extends Persona no se puede porque persona es clase final
    
    @Override
    public void imprimir(){
        System.out.println("Imprimiendo desde Empleado");
    }
    
}
