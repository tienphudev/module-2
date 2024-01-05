package model;



public abstract class Material implements Discount {
    public String id;
    public String name;

    int cost;

    public Material(String id, String name, int cost) {
        this.id = id;
        this.name = name;

        this.cost = cost;
    }

    public Material() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract double getAmount();


    @Override
    public String toString() {
        return "Material{" + "id='" + id + '\'' + ", name='" + name + '\'' +

                ", cost=" + cost + '}';
    }


}
