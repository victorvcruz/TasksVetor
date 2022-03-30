import java.util.Scanner;

public class UmDoisTres {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int repeticao = input.nextInt();

        input.nextLine();

        int acertos = 0;

        for(int n=0; n < repeticao; n++) {
            String frase = input.nextLine();
            acertos = 0;

            String ref1 = "one";
            String ref2 = "two";
            String ref3 = "three";

            if(frase.length() == ref1.length()){
                for (int j = 0; j < ref1.length(); j++) {
                    Character characterAtualRef = ref1.charAt(j);
                    if (frase.charAt(j) == characterAtualRef) {
                        acertos++;
                     }
                }

                if(acertos >= 2){
                    System.out.printf("1%n");
                } else {
                    acertos = 0;
                    for (int j = 0; j < ref2.length(); j++) {
                        Character characterAtualRef = ref2.charAt(j);
                        if (frase.charAt(j) == characterAtualRef) {
                            acertos++;
                        }
                    }
                    if(acertos >= 2){
                        System.out.printf("2%n");
                    }
                }
            } else if(frase.length() == ref3.length()) {
                acertos = 0;
                for (int j = 0; j < ref3.length(); j++) {
                    if (frase.charAt(j) == ref3.charAt(j)) {
                        acertos++;
                    }
                }
                if (acertos >= 4) {
                    System.out.printf("3%n");
                }
            }
        }

        input.close();
    }
}
