public class Task_3 {
    public static void main(String[] args) {
        int sum = 0;
        float  divide;
        int[][] array = {{12,13,15,16},{11,110,121,12},{17,18,100,21}};
        for(int r = 0 ; r<3; r++){
            for( int c = 0 ; c< 4 ; c++){
                if(array[r][c]%2==0){
                    array[r][c] = array[r][c]/2;
                }
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }
        for(int r = 0 ; r<3; r++){
            for( int c = 0 ; c< 4 ; c++){
                if(array[r][c]%2!=0){
                    System.out.println("Odd: "+ array[r][c]);
                }
            }
        }
        for(int r = 0 ; r<3; r++){
            for( int c = 0 ; c< 4 ; c++){
                if(array[r][c]%2==0){
                    sum = sum + array[r][c];
                }
            }
        }
        System.out.println("Sum of Updated Even Number: " + sum); 
    }
}
