
package contaUni;

/*Clase Alumno herederá de la clase componente Contabilidad y hará de nodo hoja
 */
public class Alumno extends Contabilidad {
    private String nombre;
    private int expediente;
    private double cuota;

    public Alumno(String nombre, int expediente, double cuota) {
        this.nombre = nombre;
        this.expediente = expediente;
        this.cuota = cuota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getExpediente() {
        return expediente;
    }

    public double getCuota() {
        return cuota;
    }

    @Override
    public void añadir(Contabilidad c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrar(Contabilidad c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contabilidad getAlumno(int i) {
        return null;
    }
}
