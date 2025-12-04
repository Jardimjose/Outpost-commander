package com.outpost.colony;

public class Resource {
    private final ResourceType type;
    private int amount;
    private int dailyConsumption = 5;  // default starts at 5
    private int dailyProduction = 0; // a new colony has no production

     public Resource(ResourceType type, int initialAmount) {
        this.type = type;
        this.amount = initialAmount;
    }
    
}
