import java.util.ArrayList;
import java.util.Scanner;

public class Achei {

    public static int valorAleatoria = 0;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        ArrayList<Integer> lista = new ArrayList<Integer>(size);

        for(int i=0;i<size;i++) {
            int number = input.nextInt();

            lista.add(number);
        }

        System.out.printf("%d%n", lista.size());
        int searchAmount = input.nextInt();

        for(int i=0;i<searchAmount;i++){
            int number = input.nextInt();

            if(estaNaLista(lista, number)) {
                printar("ACHEI");
            } else {
                printar("NAO ACHEI");
            }
        }

        input.close();
    }

    public static boolean estaNaLista(ArrayList<Integer> lista, Integer numero) {
        for(int j=0;j<lista.size();j++){
            if(lista.get(j) == numero) {
                return true;
            }
        }

        return false;
    }

    public static void printar(String str) {
        System.out.println(str);
        return;
    }
}
