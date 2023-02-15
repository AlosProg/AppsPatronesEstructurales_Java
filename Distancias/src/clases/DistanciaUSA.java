
package clases;

/*Distancias en el Sistema Anglosajon (yardas y millas) que utiliza el país
 */
public class DistanciaUSA {
    public double distanciaYardas(int disMillas) {
        double disYardas = disMillas * 1760;// 1 milla equivale a 1760 yardas
        return disYardas;
    }
    public double distanciaMillas(int disYardas) {
        double disMillas = disYardas / 1760; // 1760 yardas equivalen a 1 millas
        return disMillas;
    }
}
