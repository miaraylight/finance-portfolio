package com.pluralsight;

public class Gold extends FixedAsset{
    private final double weight;

    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        double pricePerGram = super.getMarketValue();
        return weight * pricePerGram;
    }
}
