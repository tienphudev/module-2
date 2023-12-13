public class Fan {
    private final int SLOW=1;
    private final int MEDIUM=2;
    private final int FAST=3;
    private  int velocity=1;
    private  boolean power=false;
    private  double radius=5;
    private  String Corlor = "blue";

    public Fan() {
    }

    public Fan(int velocity, boolean power, double radius, String corlor) {
        this.velocity = velocity;
        this.power = power;
        this.radius = radius;
        Corlor = corlor;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getVelocity() {
        return velocity;
    }

    public boolean isPower() {
        return power;
    }

    public double getRadius() {
        return radius;
    }

    public String getCorlor() {
        return Corlor;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCorlor(String corlor) {
        Corlor = corlor;
    }
    public String toString(){
        if(power==true){
            return "Fan is on ,Speed:"+ velocity+ " with color "+ Corlor +"with radius " + radius;
        }else {
            return "Fan is off with color "+ Corlor+"with radius " + radius;
        }
    }

}
