import java.util.Scanner;
public class ShippingCost
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the price of an item: ");

        int itemPrice = in.nextInt();
        double shippingCost;

        if (itemPrice>=100)
            shippingCost = 0;
        else
            shippingCost = 0.02 * itemPrice;

        double totalCost = itemPrice + shippingCost;
        System.out.println("The shipping cost is :$"+ shippingCost);
        System.out.println("The total cost is :$" +totalCost);

    }
}