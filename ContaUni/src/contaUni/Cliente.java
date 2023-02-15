
package contaUni;


public class Cliente {

 /*AA2 PRUEBAS DEL PATRON COMPOSITE
 */
    public static void main(String[] args) {
        
        Contabilidad contabilidad = new Universidad();//instancia de una contabilidad
        
        Alumno alumno1 = new Alumno("Pepe Perez",1,400);//nombre del alumno, nº de expediente y cuota mensual
        Alumno alumno2 = new Alumno("Juan Garcia",2,600);
        Alumno alumno3 = new Alumno("Pedro Romero",3,200);
        Alumno alumno4 = new Alumno("Carlos Cortés",4,800);
        
        contabilidad.añadir(alumno1);//aniadimos los alumnos a la clase contabilidd
        contabilidad.añadir(alumno2);
        contabilidad.añadir(alumno3);
        contabilidad.añadir(alumno4);
        
        System.out.println("La cuota total de todos los alumnos es: " + contabilidad.getCuota() + " euros");
        contabilidad.borrar(alumno2);
        
        System.out.println("La cuota total de todos los alumnos es: " + contabilidad.getCuota() + " euros");
        System.out.println(contabilidad.getAlumno(2).getCuota());//obtendremos la cuota del tercer alumno
    }
}
