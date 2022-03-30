import java.util.ArrayList;
import java.util.Scanner;


public class InverteVetor {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int maior = 0;
        int menor = 0;
        ArrayList<Integer> lista2 = new ArrayList<Integer>(size);
        ArrayList<Integer> lista = new ArrayList<Integer>(size);

        for(int i = 0; i < size; i++) {

            int number = input.nextInt();

            lista.add(number);
            System.out.printf("%d ", lista.get(i));

            if (i == 0) {
                maior = number;
            } if (number > maior) {
                maior = number;
            }
            if (i == 0) {
                menor = number;
            } if (number < menor) {
                menor = number;
            }
        }

        System.out.println("");
        int contador = 0;
        for(int j=lista.size()-1; j!=-1; j--){
            contador++;
            lista2.add(lista.get(j));
            System.out.printf("%d ", lista2.get(contador-1));
        }
        System.out.printf("%n%d", maior);
        System.out.printf("%n%d", menor);

        input.close();

    }
}
