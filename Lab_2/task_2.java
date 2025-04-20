import java.util.Scanner;

class task_2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int arr[] = new int[10];
		for (int i = 0 ; i < 10 ; i++)
		{
			System.out.println("Enter Index " + (i+1) + ": ");
			arr[i] = input.nextInt();
			if (arr[i]%4 == 0)
			{
				sum = sum + arr[i];
			}
		}
		System.out.println("Total Sum of 4: "+ sum);
} 	// End of main
}	// End of Class