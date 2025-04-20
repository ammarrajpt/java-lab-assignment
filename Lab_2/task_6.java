import java.util.Scanner;
public class task_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = input.nextInt();
        if (age >= 18){
            System.out.println("You are Eligible for voting");
        }
        else{
            System.out.println("You are not eligible for voting");
        }
    }
}