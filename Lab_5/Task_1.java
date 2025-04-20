public class Task_1 {
    public static void main(String[] args) {
        Book rdpd = new Book("prisoner of zendaya", "jeson", true);
        Book twows = new Book("think and grow rich", "napoleon hill", true);

        rdpd.Display_Book();
        System.out.println("=======================");
        twows.Display_Book();
        System.out.println("=======================");
        rdpd.Borrow_book();
        rdpd.Display_Book();
        System.out.println("=======================");
        rdpd.Return_Book();
        rdpd.Display_Book();
        System.out.println("=======================");

    }
}
