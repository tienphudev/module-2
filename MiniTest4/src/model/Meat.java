package model;

import java.time.LocalDate;

public class Meat extends Material{
    public int weight;

    public Meat() {
    }

    public Meat(String id, String name, int cost, int weight) {
        super(id, name, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return cost*weight;
    }

    @Override
    public double getRealMoney() {
        return (getRealMoney()*3/100);
    }
}
