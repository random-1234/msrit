import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of sales persons: ");
        int salespeople = in.nextInt();

        System.out.println("Enter the sales for each salesperson");
        int[] sales = new int[salespeople];
//        Take sales input from user
        for (int i=0; i<sales.length;i++){
            System.out.print("Enter the number of sales by SalesPerson "+(i+1)+": ");
            sales[i] = in.nextInt();
        }

//      Finding sum,average
        int total_sales = 0;
        int max_sale = 0;
        int max_sale_index = 0;
        int min_sale = sales[0];
        int min_sale_index = 0;
        for (int j=0;j<sales.length;j++) {
            total_sales += sales[j];
            if(sales[j]>max_sale){
                max_sale = sales[j];
                max_sale_index = j;
            }
            if(sales[j]<min_sale){
                min_sale = sales[j];
                min_sale_index = j;
            }
        }

        int average = total_sales/sales.length;

//        Print the data
        System.out.println("\n");
        for (int i=0; i<sales.length;i++){
            System.out.println("Sales ID: "+(i+1)+"   Sales: "+sales[i]);
        }
        System.out.println("\n");
        System.out.println("The total number of sales : "+total_sales);
        System.out.println("Average sales is: "+ average);
        System.out.println("Salesperson "+max_sale_index+" has the had highest sale with: $"+max_sale);
        System.out.println("Salesperson "+min_sale_index+" has the had lowest sale with: $"+min_sale);
        System.out.println("");

//      Taking the user expectations
        System.out.print("Enter your expected sales: ");
        int expectation = in.nextInt();

//        Printing the salespeople who exceeded the expectations
        System.out.println("Here are the people who exceeded your expectations");
        int count_salesperson_exceeded_expectation = 0;
        for (int i=0; i<sales.length;i++){
            if(sales[i]>expectation){
                System.out.println("Sales ID: "+(i+1)+"   Sales: "+sales[i]);
                count_salesperson_exceeded_expectation ++;
            }
        }
        System.out.println("Total SalesPerson who exceeded your expectations: "+count_salesperson_exceeded_expectation);
    }



}
