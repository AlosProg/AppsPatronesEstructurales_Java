
package clases;

/*Clase que hereda la clase TipoBicicleta y extiende sus métodos
 */
public class BiciCarreras extends Bicicleta {
    
    public BiciCarreras(TipoColor color) {
        super(color);
    }

    @Override
    public void construir() {
        System.out.println("Construyendo BICI DE CARRERAS");
        color.pintarBici();
    }
}
