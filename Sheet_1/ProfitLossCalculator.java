import java.util.Scanner;

public class ProfitLossCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price (CP): ");
        double costPrice = sc.nextDouble();

        System.out.print("Enter Selling Price (SP): ");
        double sellingPrice = sc.nextDouble();

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("Profit = " + profit);
        } else if (sellingPrice < costPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("Loss = " + loss);
        } else {
            System.out.println("No Profit, No Loss.");
        }

        sc.close();
    }
}
