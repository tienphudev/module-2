public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(String message){
        super(message);
    }

    public static double calculateTriangleArea(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b) <= c || (b + c) <= a || (c + a) <= b) {
//            throw new IllegalTriangleException("Tam giác không hợp lệ");}
            System.out.println("Tam giác không hợp lệ");}
            double p = (a + b + c) / 2.0;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return area;
        }
    }
