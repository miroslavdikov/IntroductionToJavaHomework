import java.util.Locale;
import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner input= new Scanner(System.in);
        float firstNumber= input.nextFloat();

        float secondNumber= input.nextFloat();

        float thirdNumber= input.nextFloat();

        float averageNumber= (firstNumber+secondNumber+thirdNumber) /3;

        System.out.printf("%.2f", averageNumber);

    }
}
