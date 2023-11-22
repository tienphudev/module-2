public class QuadraticEquation {
    public double a;
    public double b;
    public double c;
    public double delta;


    public QuadraticEquation(){};
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
            return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return delta=Math.pow(b,2)-4*(a*c);
    }
    public void solveEquation() {
        double discriminant = getDiscriminant();

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two distinct roots:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one root:");
            System.out.println("Root: " + root);
        } else {
            System.out.println("The equation has no roots.");
        }
    }


    }


