import java.util.Scanner;
public class task_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = {2,56,49,13,78,39,105,67};
        int large = array[0];
         int small = array[0];
        for (int i = 0 ; i<array.length ; i++){
            if (large <= array[i]){
                large = array[i];
            }
            else if(small >= array[i]){
                small = array[i];
            }
        }
        System.out.println("Largest Number: " + large);
        System.out.println("Smallest Number : " + small);
        if (large %2==0){
            System.out.println("Largest number is Divisible by 2 "+ large );
        }
        else{
            System.out.println("Largest number is not Divisible by 2 "+ large);
        }
    }
}
