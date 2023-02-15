
package clases;

/*Distancias en el SI(metros y kilómetros) que utiliza el país
 */
public class DistanciaEspaña extends Distancias_SI {
    
    @Override
    public double distanciaMetros(int disKms) {
        double disMetros = disKms * 1000;
        return disMetros;
    }

    @Override
    public double distanciaKms(int disMetros) {
        double disKms = disMetros / 1000;
        return disKms;
    }
    
}
