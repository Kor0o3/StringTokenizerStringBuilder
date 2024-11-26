//Ejercicio 5: Contador de vocales Escribe un programa que cuente cuántas vocales tiene una frase ingresada por el usuario.

import java.util.Scanner;
import java.util.StringTokenizer;

public class contarvocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, palabra;
        int contVocales = 0;

        System.out.print("Ingresa una frase: ");
        frase = sc.nextLine();

        StringBuilder vocal = new StringBuilder(frase.toLowerCase());

        for (int i = 0; i < vocal.length(); i++) {
            if (String.valueOf(vocal.charAt(i)).matches("[aeiou]")) {
                contVocales++;
            }
        }
        System.out.println("Hay " + contVocales + " vocales");
    }
}
