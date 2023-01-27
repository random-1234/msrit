
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sales = new int[5];
        int totalSales = 0;
        int maxSale = 0;
        int maxSaleId = 0;
        int minSale = Integer.MAX_VALUE;
        int minSaleId = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = sc.nextInt();
            totalSales += sales[i];

            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxSaleId = i + 1;
            }

            if (sales[i] < minSale) {
                minSale = sales[i];
                minSaleId = i + 1;
            }
        }

        double averageSale = (double) totalSales / 5;

        System.out.println("ID\t\tSales");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "\t\t" + sales[i]);
        }

        System.out.println("Total Sales: " + totalSales);
        System.out.println("Average Sale: " + averageSale);
        System.out.println("Salesperson " + maxSaleId + " had the highest sale with $" + maxSale + ".");
        System.out.println("Salesperson " + minSaleId + " had the lowest sale with $" + minSale + ".");

        System.out.print("Enter a value: ");
        int value = sc.nextInt();
        System.out.println("Salesperson(s) who exceeded $" + value + ":");
        for (int i = 0; i < 5; i++) {
            if (sales[i] > value) {
                System.out.println((i + 1) + ": $" + sales[i]);
            }
        }
    }
}