import java.util.Scanner;

class task_3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Rows");
		int row= input.nextInt();
		System.out.println("Enter the Columns");
		int col = input.nextInt();
		int arr1[][] = new int[row][col];
		int arr2[][] = new int[row][col];
		
		System.out.println("Enter the First Matrix");
		for (int r = 0 ; r < row ; r++)
		{
			for (int c = 0 ; c < col ; c++)
			{
				arr1[r][c] = input.nextInt();

			}
		}
		System.out.println("Enter the Second Matrix");
		for (int r = 0 ; r < row ; r++)
		{
			for (int c = 0 ; c < col ; c++)
			{
					arr2[r][c] = input.nextInt();
			}
		}
		int sum11 = arr1[1][1] + arr2[1][1];
		int sum00 = arr1[0][0] + arr2[0][0];
		int sum01 = arr1[0][1] + arr2[0][1];
		int sum10 = arr1[1][0] + arr2[1][0];
		System.out.println("Total Sum of Matrix: \n" + sum00 + "\t" + sum01 + "\n" + sum10 + "\t" + sum11 );
		
} 	// End of main
}	// End of Class