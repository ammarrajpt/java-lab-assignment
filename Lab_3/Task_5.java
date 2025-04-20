import  java.util.Scanner;
public class Task_5 {

    static boolean[][] seats = new boolean[5][5]; // 5x5 seat matrix (false = available, true = reserved)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Display Available Seats\n2. Reserve a Seat\n3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1 : displaySeats();
                case 2 : reserveSeat(input);
                case 3 : System.out.println("Exiting... Thank you!");
                default : System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);

        input.close();
    }

    static void displaySeats() {
        System.out.println("\nSeat Map (0 = Available, X = Reserved):");
        for (boolean[] row : seats) {
            for (boolean seat : row) {
                System.out.print(seat ? "X " : "0 ");
            }
            System.out.println();
        }
    }

    static void reserveSeat(Scanner scanner) {
        System.out.print("Enter row (0-4): ");
        int row = scanner.nextInt();
        System.out.print("Enter column (0-4): ");
        int col = scanner.nextInt();

        if (row < 0 || row >= 5 || col < 0 || col >= 5) {
            System.out.println("Invalid seat! Try again.");
        } else if (seats[row][col]) {
            System.out.println("Seat already reserved!");
        } else {
            seats[row][col] = true;
            System.out.println("Seat reserved successfully.");
        }
    }
}
    