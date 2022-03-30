import java.util.ArrayList;
import java.util.Scanner;

public class MaiorFrequencia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        ArrayList<Integer> lista = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) {

            int number = input.nextInt();

            lista.add(number);
        }
        int number = 0;
        int frequencia = 0;
        int frequenciaMaior = 0;
        int numberFrequenciaMaior = 0;

        for(int j = 0; j < lista.size(); j++){

            if(j == 0){
                number = lista.get(0);
            }
            if(lista.get(j) == number){
                frequencia++;
            }
            if(j+1 == lista.size()){
                if(frequencia > frequenciaMaior){
                    frequenciaMaior = frequencia;
                    numberFrequenciaMaior = number;
                } else if(frequencia == frequenciaMaior){
                    if(numberFrequenciaMaior > number){
                        numberFrequenciaMaior = number;
                    }
                }
                lista.remove(0);
                frequencia = 0;
                j = -1;
            }
        }
        System.out.printf("%d%n%d", numberFrequenciaMaior, frequenciaMaior);
        input.close();
    }
}
