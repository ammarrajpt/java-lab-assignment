import java.util.Scanner;
public class task_7 {
    public static void main(String[] args) {
        Scanner cylinder = new Scanner(System.in);
        System.out.println("Enter The Radius of Cylinder: ");
        int radius = cylinder.nextInt();
        System.out.println("Enter The Height of Cylinder: ");
        int height = cylinder.nextInt();
        System.out.println("The Volume of Cylinder is: "  + ((radius * radius)*height));
        cylinder.close();
    }
}
