import salario.Salario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira o salário inicial: ");
        Scanner sc = new Scanner(System.in);

        try {
           Salario sal = new Salario(sc.nextDouble());

            System.out.println(sal.fixSalary());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}