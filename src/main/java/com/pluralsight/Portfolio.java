package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets = new ArrayList<>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double netValue = 0;
        for (Valuable asset: assets) {
            netValue += asset.getValue();
        }

        return netValue;
    }

    public Valuable getMostValuable() {
        double highestValue = 0;
        Valuable mostValuable = null;
        for (Valuable asset: assets) {
            if (asset.getValue() > highestValue) {
                mostValuable = asset;
                highestValue = asset.getValue();
            }
        }

        return mostValuable;
    }

    public Valuable getLeastValuable() {
        double highestValue = getMostValuable().getValue();
        Valuable leastValuable = null;
        for (Valuable asset: assets) {
            if (asset.getValue() < highestValue) {
                leastValuable = asset;
                highestValue = asset.getValue();
            }
        }

        return leastValuable;
    }
}
