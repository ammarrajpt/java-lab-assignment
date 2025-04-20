import java.util.Scanner;

class task_5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int arr1[][] = new int[4][5];
		int arr2[][] = new int[4][5];
		
		System.out.println("Enter the Matrix");
		for (int r = 0 ; r <4 ; r++)
		{
			for (int c = 0 ; c < 5 ; c++)
			{
				arr1[r][c] = input.nextInt();
			}
			System.out.println("----------");
		}
		for (int r = 0 ; r < 4 ; r++)
		{
			for (int c = 0 ; c < 5 ; c++)
			{
					System.out.print(arr1[r][c] + "  ");
			}
			System.out.println();
		}
	} 	// End of main
}	// End of Class