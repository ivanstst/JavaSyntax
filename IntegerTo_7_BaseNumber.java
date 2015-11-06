import java.util.Scanner;

/**
 * Created by Ivan on 6.11.2015 ?..
 */
public class IntegerTo_7_BaseNumber {
    public static void main(String[] args) {
        System.out.println("Enter an integer number to be converted to base-7");
        Scanner reader = new Scanner(System.in);
        Integer numberForConvertion = reader.nextInt();
        System.out.println(Integer.toString(numberForConvertion, 7));
    }
}
