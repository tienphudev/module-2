package model;



public class CrispyFlour extends Material  {
    public int quantity;

    public CrispyFlour(String id, String name,  int cost, int quantity) {
        super(id, name, cost);
        this.quantity = quantity;
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount()   {
        return quantity*cost;
    }

    @Override
    public double getRealMoney() {
        return (getRealMoney()*6)/100;


    }
}









