import salario.Salary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira o valor do salario mínimo e do seu salário: ");

        Scanner sc = new Scanner(System.in);

        try {
            Salary salary = new Salary(sc.nextDouble(), sc.nextDouble());
            System.out.println(salary.countSalary());
        } catch (Exception e) {
            System.out.println("Erro ao converter");
        }
    }
}