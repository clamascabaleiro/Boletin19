package boletin19_1;

import java.util.Arrays;

/**
 *
 * @author clamascabaleiro
 */
public class Aleatorio {
    int [] numeros = new int [6];
    public void numeroAleatorio(){
        
       for(int i = 0;i<numeros.length;i++){
           numeros[i] = (int)(Math.random() * 50)+1;
           System.out.println(numeros[i]);
          
       }
           
       }
    public void numeroReves() {
        System.out.println("************Ordenado al reves******************");
      for(int contador=numeros.length-1; contador>=0; contador--)
          System.out.println(numeros[contador]);
        
    }
    }

