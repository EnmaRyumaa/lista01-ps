import triangulo.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira os valores dos 2 catetos: ");

        Scanner sc = new Scanner(System.in);

        try {
            Triangulo triangulo = new Triangulo(sc.nextDouble(), sc.nextDouble());
            System.out.println(triangulo.calcHipotenuse());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}