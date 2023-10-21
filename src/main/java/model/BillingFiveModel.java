package model;

import java.util.List;

public record BillingFiveModel(String client, String dateBilling, List<Double> priceProduct){}


