
package clases;

/*Clase que hereda la clase TipoBicicleta y extiende sus métodos
 */
public class BiciMontaña extends Bicicleta {
    
    public BiciMontaña(TipoColor color) {
        super(color);
    }

    @Override
    public void construir() {
        System.out.println("Construyendo BICI DE MONTAÑA");
        color.pintarBici();
    }
}
