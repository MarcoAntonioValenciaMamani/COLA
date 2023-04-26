package cola;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class COLA {

    public static void main(String[] args) {
        //
        Queue q = new LinkedList();
        Object elem;

        Scanner leer = new Scanner(System.in);
        //LLENAR n ELEMENTOS 
        int n = leer.nextInt();
        for (int i = 1; i <= n; i++) {
            elem = leer.nextInt();
            q.add(elem);

        }
        ///OBTENER Y MOSTAR EL PRIMER ELEMENTO
        System.out.println("1er ELEMENTO:  " + q.peek());
//ELIMINAR EL PRIMER ELEMENTO
        q.poll();
//MOSTRAR EL TAMAÑO DE LA COLA
        System.out.println("TAMAÑO:  " + q.size());
        //VER SI LA COLA ESTA VACIA
        if(q.isEmpty()){
            System.out.println("Esta Vacia");
            
        }
        else{
            System.out.println("NO ESTA VACIA");
        }
        //MOSTRAR LOS ELEMENTOS DE LA COLA
        Queue aux =new LinkedList();
        while(!q.isEmpty()){
            
        }
            
    }

}
