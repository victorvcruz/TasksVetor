import java.util.ArrayList;
import java.util.Scanner;

public class MenorDistancia {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int repeticao = input.nextInt();
        int size = 0;
        ArrayList<Integer> lista = new ArrayList<Integer>(size);

        for(int i = 0; i < repeticao; i++){
            lista.clear();
            size = input.nextInt();

            for(int j = 0; j < size; j++){

                int number = input.nextInt();
                lista.add(number);
            }

            int number = 0;
            int distancia = 0;
            int distanciaMenor = 100000;
            for(int n = 0; n < lista.size(); n++){
                if(n == 0){
                    number = lista.get(0);
                    lista.remove(0);
                }

                if(lista.size() == 0) {
                    break;
                }

                distancia = lista.get(n) - number;
                if(distancia < 0) {
                    distancia *= -1;
                }

                if(distancia < distanciaMenor){
                    distanciaMenor = distancia;
                }

                if(n+1 == lista.size()){
                    n = -1;
                }
            }
        System.out.printf("%n%d %d", distanciaMenor, size * size);
        }
        input.close();
    }
}
