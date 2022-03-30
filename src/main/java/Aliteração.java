import java.util.Scanner;

public class Aliteração {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        String frase = input.nextLine();
        Character espaco = ' ';
        Character comparador = null;
        Character comparadorMaiusculo = '#';
        Character comparadorMinusculo = '#';
        int quantidade = 0;
        int guardarQuantidade = 0;
        for(int i = 0; i < frase.length(); i++){
            if(i == 0){
                comparador = frase.charAt(0);
            }
            int ascii = (int) comparador;
            if (ascii < 91 || ascii > 64){
                ascii = ascii + 32;
                comparadorMaiusculo = (char) ascii;
            } else{
                ascii = ascii - 32;
                comparadorMinusculo = (char) ascii;
            }
            if(frase.charAt(i) == espaco){
                if(frase.charAt(i+1) == comparador || frase.charAt(i+1) == comparadorMaiusculo || frase.charAt(i+1) == comparadorMinusculo){
                    quantidade = 1;
                } else{
                    guardarQuantidade = guardarQuantidade + quantidade;
                    quantidade = 0;
                    comparador = frase.charAt(i+1);
                }
            }
            if(i == frase.length()-1){
                guardarQuantidade = guardarQuantidade + quantidade;
            }

        }
        System.out.printf("%d", guardarQuantidade);
        input.close();
    }
}
