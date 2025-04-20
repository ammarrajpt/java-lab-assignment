import java.util.Scanner;
public class task_8 {
    public static void main(String[] args) {
        Scanner speed = new Scanner(System.in);
        System.out.println("Convert mph into kmph");
        float mph = speed.nextFloat();
        System.out.println("Result: " + (mph * 1.6) + " Kilometer per hour");
    }
}
