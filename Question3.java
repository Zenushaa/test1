public class Question3 {
    public static void main(String[] args) {
        // Write a Java program to print the given pattern.
        // 1
        // 12
        // 123
        // 1234
        // 12345
        int i,j;
        for (i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
