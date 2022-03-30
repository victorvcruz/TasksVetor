import java.util.Scanner;

public class Criptografia {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int repeticao = input.nextInt();
        input.nextLine();

        for(int i = 0; i < repeticao; i++) {
            String frase = input.nextLine();
            String etapa1 = "";
            String etapa2 = "";
            String etapa3 = "";
            for (int j = 0; j < frase.length(); j++) {
                int ascii = (int) frase.charAt(j);
                if ((ascii < 32 || ascii > 64) && (ascii < 91 || ascii > 96) && (ascii < 123 || ascii > 126)) {
                    ascii = (int) frase.charAt(j) + 3;
                }
                char result = (char) ascii;
                etapa1 = etapa1 + result;

            }
            for (int n = frase.length() - 1; n != -1; n--) {
                etapa2 = etapa2 + etapa1.charAt(n);
            }
            for (int y = 0; y < frase.length(); y++) {
                int ascii = (int) etapa2.charAt(y);
                if (y >= frase.length() / 2) {
                    ascii = (int) etapa2.charAt(y) - 1;
                }
                char result = (char) ascii;
                etapa3 = etapa3 + result;
            }
            System.out.println(etapa3);
        }
        input.close();
    }
}
