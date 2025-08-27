import circulo.Circunferencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira o valor do raio: ");

        Scanner sc = new Scanner(System.in);

        try {
            Circunferencia circunferencia = new Circunferencia(sc.nextDouble());
            System.out.println(circunferencia.toString());
        } catch (Exception e) {
            System.out.println("Erro ao converter");
        }
    }
}