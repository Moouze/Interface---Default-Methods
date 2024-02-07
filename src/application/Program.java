package application;

import services.BrazilInterestService;
import services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade: ");
        double amount = sc.nextDouble();
        System.out.print("Meses: ");
        int months = sc.nextInt();

        InterestService in = new BrazilInterestService(2.0);
        double payment = in.payment(amount, months);

        System.out.println("Valor atualizado com juros: ");
        System.out.println(String.format("%.2f ", payment));
    }
}
