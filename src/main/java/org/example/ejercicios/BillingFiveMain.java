package org.example.ejercicios;

import constants.Constants;
import model.BillingFiveModel;
import java.util.List;

//This is the main class
public class BillingFiveMain {

    //Method to calculate the total of an account
    public static Double calculateTotalAccount(List<Double> billing) {
        double totalValueBillingOne = 0;
        if (!billing.isEmpty()) {
            for (Double price : billing) {
                totalValueBillingOne += price;
            }
            return totalValueBillingOne;
        } else {
            return 0.0;
        }
    }
    public static void main(String[] args) {

        Constants.LOGGER.info("The BillingFiveMain class is being executed");

        BillingFiveModel billingOne = new BillingFiveModel("Mania Sanabria", "Julio 1, 1999", List.of(4500D, 5000D, 2500D));
        BillingFiveModel billingTwo = new BillingFiveModel("Juan Perez", "Agosto 15, 2000", List.of(3500D, 6000D, 2800D));

        System.out.println("------------- Mania's bill is -------------------");
        System.out.println("Bill 1");
        System.out.println("Client: " + billingOne.client());
        System.out.println("Total: " + calculateTotalAccount(billingOne.priceProduct()));

        System.out.println("------------- Juan's bill is -------------------");
        System.out.println("Bill 2");
        System.out.println("Client: " + billingTwo.client());
        System.out.println("Total: " + calculateTotalAccount(billingTwo.priceProduct()));
    }

}
