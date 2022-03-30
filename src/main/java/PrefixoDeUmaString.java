import java.util.Scanner;

public class PrefixoDeUmaString {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int repeticao = input.nextInt();
        input.nextLine();


        for(int i = 0; i < repeticao; i++){

            int size = input.nextInt();
            String frase = input.nextLine();
            String fraseNew = "";

            for(int j = 0; j <= size && j != frase.length(); j++){
                fraseNew = fraseNew + frase.charAt(j);
            }

            System.out.printf("%n%s",fraseNew);
        }


        input.close();
    }
}
