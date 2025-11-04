package com.pluralsight;

public class House extends FixedAsset{
    private final int yearBuilt;
    private final int squareFeet;
    private final int bedrooms;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        double baseValue = super.getMarketValue();
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - yearBuilt;

        double pricePerSqFt;
        if (age < 10) {
            pricePerSqFt = 180.00;
        } else if (age < 20) {
            pricePerSqFt = 130.00;
        } else if (age < 40) {
            pricePerSqFt = 90.00;
        } else {
            pricePerSqFt = 80.00;
        }

        return baseValue + (squareFeet * pricePerSqFt) + (bedrooms * 10000);

    }
}
