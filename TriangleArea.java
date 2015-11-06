import java.util.Scanner;

/**
 * Created by Ivan on 5.11.2015 ?..
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int Ax = reader.nextInt();
        int Ay = reader.nextInt();
        int Bx = reader.nextInt();
        int By = reader.nextInt();
        int Cx = reader.nextInt();
        int Cy = reader.nextInt();
        int Area = ((Ax*(By - Cy) + Bx*(Cy - Ay)+Cx*(Ay - By))/2);
        if (Area < 0){
            Area = -Area;
        }
        System.out.println(Area);
    }
}
