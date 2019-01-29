

package boletin19_3;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin19_3 {

 
    public static void main(String[] args) {
       int tamaño=3;
        int[] notas=new int[tamaño];
        String[] alumnos=new String[tamaño];
        Notas clase=new Notas();
        clase.notasAlumnos(notas,alumnos);
        clase.visualizarLista(notas, alumnos);
        System.out.println("**************************");
        clase.listaOrdenCreciente(notas, alumnos);
        clase.visualizarLista(notas, alumnos);
        clase.visualizarNotaAlumno(notas, alumnos);
    }

}
