
package contaUni;

/*Clase abstracta que hará de componente
 */
public abstract class Contabilidad {
    public abstract double getCuota();
    public abstract void añadir(Contabilidad c);
    public abstract void borrar(Contabilidad c);
    public abstract Contabilidad getAlumno(int i);
    
}
