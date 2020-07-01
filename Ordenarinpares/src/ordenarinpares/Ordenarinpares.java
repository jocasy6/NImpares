
package ordenarinpares;

import java.util.Arrays;


public class Ordenarinpares {

   static int []Impares(int[] Nlista){
       int[] nuevo= new int [Nlista.length];
       int i, posicionIzq =0, posicionDer = Nlista.length-1;
          
            for (i=0; i < Nlista.length; i++){
                if (Nlista[i]%2==0)
                {
                nuevo[posicionIzq]= Nlista[i];
                posicionIzq++;
                }
                else{
                nuevo[posicionDer]= Nlista[i];
                posicionDer--;
                }
                    }
       return nuevo;
   }
    public static void main(String[] args) {
        int[] numeros= new int[20];
        int i;
        System.out.println("programa que muestra numeros desordenados aleatoreos y luego los ordena en pares e impares\n");
            for (i=0; i < numeros.length;i++)
            {
            numeros[i]=(int)(Math.random()*100+1);
            } 
            System.out.println("Numeros sin estar ordenados: "+Arrays.toString(numeros));
            numeros=Impares(numeros);
            System.out.println("Numeros ordenados pares e impares: "+Arrays.toString(numeros));
            
        // TODO code application logic here
    }
    
}
