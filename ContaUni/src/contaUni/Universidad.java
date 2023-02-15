
package contaUni;

import java.util.ArrayList;

/*Clase composite que hereda de la clase componente Contabilidad 
y a la vez está compuesta por ella
 */
public class Universidad extends Contabilidad {
    private ArrayList<Contabilidad> alumnos = new ArrayList<Contabilidad>(); //Estrcutura de datos donde estaran todos los alumnos

    @Override
    public double getCuota() { //Metodo que calculara la cuota de todos los alumnos
        double cuotaTotal = 0;
        for (int i = 0; i<alumnos.size();i++){
            cuotaTotal = cuotaTotal + alumnos.get(i).getCuota();
        }
        return cuotaTotal;
    }

    @Override
    public void añadir(Contabilidad c) {//Con la herencia podremos aniadir alumnos
        alumnos.add(c);
    }

    @Override
    public void borrar(Contabilidad c) {//Con la herencia podremos borrar alunnos
        alumnos.remove(c);
    }

    @Override
    public Contabilidad getAlumno(int i) {//Podremos obtener un alumno en concreto
       return alumnos.get(i);
    }
}
