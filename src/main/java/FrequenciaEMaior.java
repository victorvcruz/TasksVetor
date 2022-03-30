import java.util.ArrayList;
import java.util.Scanner;

public class FrequenciaEMaior {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    int repeticao = 0;
    int maior = 0;
    int indice = 0;
        ArrayList<Integer> lista = new ArrayList<Integer>(size);

    for(int i = 0; i < size; i++) {

        int number = input.nextInt();

        lista.add(number);

        if (i == 0) {
            maior = number;
        } if (number > maior) {
            maior = number;
        }
    }

        int last = lista.get(size - 1);
        for (int j = 0; j < lista.size(); j++) {
            if (lista.get(j) == last) {
                repeticao++;

            }
        }

        for(int n = 0; n < lista.size(); n++){
            if(lista.get(n) == maior){
                indice = n;
                break;
            }

        }
        System.out.printf("Nota %d, %d vezes%nNota %d, indice %d", last, repeticao, maior, indice);
    input.close();
    }
}
