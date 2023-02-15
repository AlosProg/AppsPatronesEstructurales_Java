
package clases;

/*Clase abstracta que representa la jerarquia de tipo de bicis y que crea como puente (Bridge) 
un objeto de la jerarquía de colores
 */
public abstract class Bicicleta {
    protected TipoColor color;

    public Bicicleta(TipoColor color) {
        this.color = color;
    }
    
    public abstract void construir();
    
}
