import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner numberInDecimal= new Scanner(System.in);
        int decimalNumber= numberInDecimal.nextInt();

        String ghettoNumber= new String();

        while(decimalNumber!=0){
            int number=decimalNumber%10;
            switch (number){
                case 0: ghettoNumber= "Gee"+ ghettoNumber; break;
                case 1: ghettoNumber= "Bro"+ ghettoNumber; break;
                case 2: ghettoNumber= "Zuz"+ghettoNumber; break;
                case 3: ghettoNumber="Ma"+ghettoNumber; break;
                case 4: ghettoNumber="Duh"+ghettoNumber; break;
                case 5: ghettoNumber="Yo"+ghettoNumber; break;
                case 6: ghettoNumber="Dis"+ghettoNumber; break;
                case 7: ghettoNumber="Hood"+ghettoNumber; break;
                case 8: ghettoNumber="Jam"+ghettoNumber; break;
                case 9: ghettoNumber="Mack"+ghettoNumber; break;

                default: break;
            }
            decimalNumber = decimalNumber/10;
        }

        System.out.println(ghettoNumber);
    }
}
