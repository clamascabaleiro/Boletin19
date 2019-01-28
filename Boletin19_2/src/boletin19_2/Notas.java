package boletin19_2;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Notas {
    
    public int darValor(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduzca un valor"));
    }
    public void crearArray(int [] array){
        for(int i= 0;i<array.length;i++)
            array[i] = darValor();
            }
    public void numeroAprobadoSuspenso(int[] array) {
        int aprobado = 0;
        int suspenso = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5.0) {
                aprobado++;
            } else {
                suspenso++;
            }
        }
        System.out.println("Aprobados: " + aprobado + "\nSuspensos: " + suspenso);
    }
    public void NotaMedia(int[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total +=array[i];
        }
        System.out.println("Nota Media: " + (total / array.length));
    }
    public void NotaAlta(int [] array){
        double alta = 0;
        for (int i = 0; i < array.length;i++){
            if(alta < array[i]){
                alta = array[i];
            }
        }
        System.out.println("Nota mas alta : " + alta);
    }
}
