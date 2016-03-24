import java.util.Scanner;

public class SumNumbersFromOneToN {
    public static void main(String[] args) {
        Scanner numberOfSums= new Scanner(System.in);
        int numbers= numberOfSums.nextInt();

        long sums=0;

        for (int i = 1; i <= numbers ; i++) {
            sums=sums+i;
        }

        System.out.println(sums);
    }
}
