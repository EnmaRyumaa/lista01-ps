import temperatura.Temperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira a temperatuca para fazermos a conversão para Farenheit: ");

        Scanner sc = new Scanner(System.in);

        try {
            Temperatura temp = new Temperatura(sc.nextDouble());
            System.out.println(temp.conversaoTemperatura());
        } catch (Exception e) {
            System.out.println("Erro ao converter");
        }
    }
}