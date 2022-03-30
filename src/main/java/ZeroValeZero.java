import java.util.Scanner;
public class ZeroValeZero {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        String ref = "0";
        String resultString;
        String resultStringNew = null;
        boolean flag = true;
        while (true) {

            int numberOne = input.nextInt();
            int numberTwo = input.nextInt();
            int result = numberOne + numberTwo;

            if(numberOne == 0 && numberTwo == 0){
                System.out.printf("%d %d", numberOne, numberTwo);
                break;
            }
            resultString = "" + result;

            for (int i = 0; i < resultString.length(); i++)
                if(resultString.charAt(i) == ref.charAt(0)){
                    resultStringNew = resultString.replace("0", "");
                    System.out.println("" + resultStringNew);
                    flag = false;
                    break;
                }

            if(flag) System.out.printf("%d", result);
        }

        input.close();
    }

}
