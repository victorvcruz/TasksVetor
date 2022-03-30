import java.util.ArrayList;
import java.util.Scanner;

public class OrdenaLista {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        ArrayList<Integer> lista = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) {

            int number = input.nextInt();

            lista.add(number);
        }

        int menor = 0;
        int posicao = 0;
        for(int j = 0; j < lista.size(); j++){

            if(lista.size() == 1){
                System.out.printf("%d", lista.get(0));
                break;
            }
            if (j == 0) {
                menor = lista.get(j);
            } if (lista.get(j) < menor) {
                menor = lista.get(j);
                posicao = j;

            }

            if(j+1 == lista.size()){
                lista.remove(posicao);
                System.out.printf("%d%n", menor);
                j = -1;
            }
        }

        input.close();
    }
}
