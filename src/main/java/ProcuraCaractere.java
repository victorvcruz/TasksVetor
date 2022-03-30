import java.util.Scanner;

public class ProcuraCaractere {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int repeticao = input.nextInt();
        input.nextLine();

        for(int i = 0; i < repeticao; i++){
           String frase = input.nextLine();

            for(int j = 2; j < frase.length(); j++){

                if(frase.charAt(0) == frase.charAt(j)){

                    System.out.printf("%nCaractere %c encontrado no indice %d da string.", frase.charAt(0), j-2);
                    break;
                }
                if(j == frase.length()-1){
                    System.out.printf("%nCaractere %c nao encontrado.", frase.charAt(0));
                    break;
                }

            }

        }
        input.close();
    }
}
