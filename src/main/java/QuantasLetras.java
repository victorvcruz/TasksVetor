import java.util.ArrayList;
import java.util.Scanner;

public class QuantasLetras {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int repeticao = input.nextInt();
        int vog = 0;
        int cons = 0;

        input.nextLine();

        for(int n=0; n < repeticao; n++) {
            String frase = input.nextLine();
                vog = 0;
                cons = 0;
            String ref = "aeiouAEIOU";

            for (int i = 0; i < frase.length(); i++) {
                Character characterAtualDaFrase = frase.charAt(i);
                boolean flag = true;
                if ((characterAtualDaFrase >= 'A' && characterAtualDaFrase <= 'Z') ||
                        (characterAtualDaFrase >= 'a' && characterAtualDaFrase <= 'z')) {

                    for (int j = 0; j < ref.length(); j++) {
                        if (characterAtualDaFrase == ref.charAt(j)) {
                            vog++;
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        cons++;
                    }
                }

            }
            int let = vog + cons;
            System.out.printf("Letras = %d%nVogais = %d%nConsoantes = %d%n", let, vog, cons);
        }


        input.close();
    }


}
