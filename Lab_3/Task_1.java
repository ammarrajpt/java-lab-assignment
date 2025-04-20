import java.util.Scanner;
public class Task_1{
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        System.out.println("Enter Starting Integer");
        int start = prime.nextInt();
        System.out.println("Enter Ending Integer");
        int end = prime.nextInt();
            for (int i = start ; i <= end ; i++){
                boolean isPrime = true ;
                for (int j = 2 ; j <= i ; j++){
                    if(i%j == 0){
                        isPrime= false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println(i + "is Prime");
                }
                
            }
        }
    } 
