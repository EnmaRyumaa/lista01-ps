import losango.Losango;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite os valores das diagonais do losango");

        Scanner sc = new Scanner(System.in);

        try {
            Losango l = new Losango(sc.nextDouble(), sc.nextDouble());
            System.out.println(l.losangoArea());
        } catch (Exception e) {
            System.out.println("Erro ao converter");
        }
    }
}