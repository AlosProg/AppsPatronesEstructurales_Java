
package clases;

/*Clase adaptador que extiende de la clase abstracta Distancia_SI
pero está tiene un objeto de DistanciaUSA y ademas devolverá este objeto en los metodos heredados
 */
public class AdaptadorDistancias extends Distancias_SI {
    private DistanciaUSA distUSA = new DistanciaUSA();

    @Override
    public double distanciaMetros(int disKms) {
        return this.distUSA.distanciaYardas(disKms)/1.6;
        
    }

    @Override
    public double distanciaKms(int disMetros) {
        return this.distUSA.distanciaMillas(disMetros)*1.25;
    }
}
