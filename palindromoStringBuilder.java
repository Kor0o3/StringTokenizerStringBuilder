//palindromo con StringBuilder
import java.util.Scanner;

public class palindromoStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String cad1;

        System.out.print("Introduce una palabra: ");
        cad1 = sc.nextLine();

        StringBuilder srtb = new StringBuilder(cad1);

        if (srtb.reverse().toString() == cad1) {
            System.out.println(srtb + " es un palindromo");
        } else {
            System.out.println(srtb + " no es un palindromo");
        }
    }
}
