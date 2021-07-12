

public class SnakeMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {1, 2, 3},
               };

        // In case of an array of size n*n put n in place i & j in the for loop


        for (int i = 0; i < 4; i++) {

            if ((i+1)%2 == 1) {

                for (int j = 0; j < 3; j++) {
                    System.out.print(arr[i][j]);

                }

            } else {

                for (int k = 2; k>=0; k--) {
                    System.out.print(arr[i][k]);


                }
            }
System.out.print(" ");

        }
    }
}

