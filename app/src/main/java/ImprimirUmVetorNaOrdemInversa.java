import java.util.ArrayList;
import java.util.Scanner;

public class ImprimirUmVetorNaOrdemInversa {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        ArrayList<Integer> lista = new ArrayList<Integer>(size);

        for(int i=0;i<size;i++) {
            int number = input.nextInt();

            lista.add(number);
        }

        for(int i=lista.size()-1; i!=-1; i--){

            System.out.printf("%d ", lista.get(i));

            }

        input.close();
    }
}
