package org.example;

import java.util.Scanner;

public class MaiorEntreDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        int maior = Math.max(numero1, numero2);

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}

