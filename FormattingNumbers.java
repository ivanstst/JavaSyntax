import java.util.Scanner;

/**
 * Created by Ivan on 5.11.2015 ?..
 */
public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter three numbers to be converted");
        int firstNumber = reader.nextInt();
        float secondNumber = reader.nextFloat();
        float thirdNumber = reader.nextFloat();

        System.out.printf(
                "|%-10s|%s|%10.2f|%-10.3f|", Integer.toHexString(firstNumber).toUpperCase(), String.format("%10s", Integer.toBinaryString(firstNumber)).replace(' ', '0'),
                secondNumber,
                thirdNumber);
        ;
    }
}
