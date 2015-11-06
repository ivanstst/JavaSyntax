import java.util.Scanner;

/**
 * Created by Ivan on 5.11.2015 ?..
 */
public class RectangleArea {
    public static void main(String[] args) {
        System.out.println("Enter the sides  of the rectangle");
        Scanner reader = new Scanner(System.in);
        int height = reader.nextInt();
        int width = reader.nextInt();
        int rectangleArea = height * width;
        System.out.println("The rectangle area is: "  + rectangleArea);

    }
}


