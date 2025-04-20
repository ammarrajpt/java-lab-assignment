import java.util.Scanner;

class task_4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String name[] = new String[6];
		String ali = "ali";

		boolean isName = false;
		for (int r = 0 ; r < name.length ; r++)
		{
			System.out.println("Enter the name "+ (r+1) + ": ");
			name[r] = input.nextLine();
			if (name[r].equals(ali))
			{
				isName =  true;
			}
		}
		if (isName)
		{
			System.out.println("Ali is present");
		}
		else
		{
			System.err.println("Ali is not in Array");
		}
	} 	// End of main
}	// End of Class