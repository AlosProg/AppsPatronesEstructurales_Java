
package clases;

/*AA2 PRUEBAS DEL PATRON BRIDGE
 */
public class Cliente {

    public static void main(String[] args) {
        Bicicleta mibici = new BiciMontaña(new ColorNegro()); // especificaciones del tipo de bici y color
        mibici.construir();// mandato de contruir la bici
        System.out.println("*************");
        Bicicleta mibici2 = new BiciCarreras (new ColorAzul());
        mibici2.construir();
    }
}
