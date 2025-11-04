package com.pluralsight;

public class Jewelry extends FixedAsset{
    private final double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        double baseValue = super.getMarketValue();

        // Purity percentage based on karat (out of 24)
        double purity = karat / 24.0;

        return baseValue * purity;
    }
}
