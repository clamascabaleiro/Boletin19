package boletin19_3;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Notas {

    public int darValorInt() {
        return Integer.parseInt(JOptionPane.showInputDialog("Introduzca un valor : "));
    }
    
    public String darValorString(){
        return JOptionPane.showInputDialog("Introduzca un nombre de alumno : ");
    }

    public void numeroAprobado(int[] arrayP, String [] arrayA) {
        for (int i = 0; i < arrayP.length; i++) {
            if (arrayP[i] >= 5.0) {
                System.out.println(arrayA[i]);
            }
        }
    }
    public void notasAlumnos(int[] arrayP, String[] arrayA) {
        for (int i = 0; i < arrayP.length; i++) {
            arrayP[i] = darValorInt();
            arrayA[i] = darValorString();
        }
    }
    
     public void listaOrdenCreciente (int[] arrayP, String[] arrayA) {

        int aux;
        String aux2;
        for (int i = 0; i < arrayP.length - 1; i++) {
            for (int j = i + 1; j < arrayP.length; j++) {
                if (arrayP[i] > arrayP[j]) {
                    aux = arrayP[i];
                    arrayP[i] = arrayP[j];
                    arrayP[j] = aux;
                    aux2 = arrayA[i];
                    arrayA[i] = arrayA[j];
                    arrayA[j] = aux2;
                }
            }
        }
    }
    public void visualizarLista(int[] arrayP, String[] arrayA) {
        for (int i = 0; i < arrayP.length; i++) {
            System.out.println("\nAlumno: " + arrayA[i]);
            System.out.println("Nota: " + arrayP[i]);

        }
    }
    public void visualizarNotaAlumno(int[] arrayP, String[] arrayA) {
        String alumno = darValorString();
        for (int i = 0; i < arrayA.length; i++) {
            if (alumno == arrayA[i]) {
                System.out.println("Nota: " + arrayP[i]);
            }
        }
    }
}
