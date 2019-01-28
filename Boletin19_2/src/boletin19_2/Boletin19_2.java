

package boletin19_2;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin19_2 {

 
    public static void main(String[] args) {
       int [] notas = new int[5];
       Notas NotasClase = new Notas();
       NotasClase.crearArray(notas);
       NotasClase.numeroAprobadoSuspenso(notas);
       NotasClase.NotaMedia(notas);
       NotasClase.NotaAlta(notas);
       
    }

}
