public class Task_2 {
    public static void main(String[] args) {
        String text = "CIVIC";
        String reverse = "";
        for (int  i= text.length()-1; i>=0 ; i--){
            reverse = reverse+text.charAt(i);
        }
        if (text.equals(reverse)){
            System.out.println("Its PALINDROME");
        }

    }
}
