import java.util.ArrayList;
import java.util.Scanner;

public class Contagem {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int size = 0;
        boolean flag = true;

        for(int i=0; flag == true; i++){
            int number = input.nextInt();

            if(number >= 1 && number <= 1000){
                size = number;
                flag = false;
                break;
            }
        }

        ArrayList<Integer> lista = new ArrayList<Integer>(size);

        for(int i=0;i<size;i++) {
            int number = input.nextInt();

            lista.add(number);
        }

        int comparador = input.nextInt();
        int contador = 0;
        for(int i=0;i<lista.size();i++){

            if(lista.get(i) >= comparador){
                contador++;

            }
        }

        System.out.printf("%d", contador);


        input.close();
    }
}
