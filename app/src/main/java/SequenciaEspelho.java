import java.util.ArrayList;
import java.util.Scanner;

public class SequenciaEspelho {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int repeticao = input.nextInt();
        String crescente = "";
        for(int i = 0; i < repeticao; i++){

            int number1 = input.nextInt();
            int number2 = input.nextInt();
            crescente = "";

            for(int j = number1; j != number2+1; j++){
                crescente = crescente + j;
            }
            System.out.printf("%n%s",crescente);

        for(int n = crescente.length()-1; n != -1; n--){
            String decrescente = "" + crescente.charAt(n);
            System.out.printf("%s", decrescente);
        }

    }

        input.close();
    }
}
