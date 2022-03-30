import java.util.ArrayList;
import java.util.Scanner;

public class ElemtentosParesDoVetor {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

    int size = input.nextInt();

    ArrayList<Integer> lista = new ArrayList<Integer>(size);

        for(int i=0;i<size;i++) {
            int number = input.nextInt();

            lista.add(number);
        }

        int contador = 0;
        for(int i=0;i<lista.size();i++){

            if(lista.get(i) % 2 == 0){
                System.out.printf("%d ", lista.get(i));
                contador++;
            }

        }

        System.out.printf("%d ", contador);

    }
}
