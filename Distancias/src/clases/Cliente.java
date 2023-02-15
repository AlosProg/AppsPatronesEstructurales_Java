
package clases;

/*AA2 PATRÓN ADAPTER PRUEBAS
 */
public class Cliente {

    
    public static void main(String[] args) {
        Distancias_SI d1 = new DistanciaEspaña();
        System.out.println(d1.distanciaKms(4000));// 5000 metros son 5 kilometros
        
        Distancias_SI d2 = new DistanciaPortugal();
        System.out.println(d2.distanciaMetros(6)); // 7 kilometros son 7000 metros
        
        Distancias_SI d3 = new AdaptadorDistancias();
        System.out.println(d3.distanciaKms(8000)); //8000 metros, ¿cuántas millas son?--> 5 millas aprox.
        
        Distancias_SI d4 = new AdaptadorDistancias();
        System.out.println(d4.distanciaMetros(7));//7 kilometros, ¿cuantas yardas son?--> 7700 yardas aprox.
        
    }
    
}
