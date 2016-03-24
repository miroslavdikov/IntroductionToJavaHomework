import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner linesOfTriangle= new Scanner(System.in);
        int lines= linesOfTriangle.nextInt();

        for (int i =97; i <= 96+lines; i++) {
            printLines('a', (char)(i));
        }

        for (int j = (96+lines)-1; j >=97; j--) {
            printLines('a',(char)(j));
        }
    }

    private static void printLines(char firstElement, char lastElement){
        for (char element = firstElement; element <=lastElement  ; element++) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
