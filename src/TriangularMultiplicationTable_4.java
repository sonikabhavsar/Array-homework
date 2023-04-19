public class TriangularMultiplicationTable_4 {
 // Program to Print the Multiplication Table in Triangular Format
    static void main(int n) {
        int i = 1;


        do{
            System.out.print( n * i +" ");
            i = i + 1;

        } while(i <= 5);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int i = 1;
        do{
            main(i);
            i = i + 1;
        } while (i <= 5);

    }
}
