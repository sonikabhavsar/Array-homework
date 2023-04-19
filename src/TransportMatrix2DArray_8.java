public class TransportMatrix2DArray_8 {
//Program ro find transport matrix 2-d array
    public static void main(String args[]) {
        // to transpose matrix of 2-D array

        //creating a matrix
            int original[][] = {{10, 20}, {25, 50}};

//creating another matrix to store transpose of a matrix
            int transpose[][] = new int[2][2];  //2 rows and 2 columns

//Code to transpose a matrix
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    transpose[i][j] = original[j][i];
                }
            }
            System.out.println("Printing Matrix without transpose:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(original[i][j] + " ");
                }
                System.out.println();//new line
            }
            System.out.println("Printing Matrix After Transpose:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();//new line


            }
        }

    }

