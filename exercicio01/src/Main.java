import media.Media;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira 3 números no formato 0,0 para realizarmos a média: ");
        Scanner sc = new Scanner(System.in);
        try {
            Double n1 = Double.parseDouble(sc.next()
                    .replace(",", "."));
            Double n2 = Double.parseDouble(sc.next()
                    .replace(",", "."));
            Double n3 = Double.parseDouble(sc.next()
                    .replace(",", "."));

            Media media = new Media(n1, n2, n3);

            System.out.println(media.makeMedia());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}