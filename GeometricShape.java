import java.util.Scanner;

public class GeometricShape {
    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            System.out.println("Enter Side of square");
            int l = in.nextInt();
            findArea(l);
            System.out.println("Enter radius of Circle");
            double r = in.nextDouble();
            findArea(r);
            System.out.println("Enter L x B of rectangle ");
            int len = in.nextInt();
            int brd = in.nextInt();
            findArea(len , brd);
        } 
    }

    private static void findArea(int len, int brd) {
        System.out.println("area is "+(len*brd));
    }

    private static void findArea(double r) {
        System.out.println("Area is "+((22/7)*r*r));
    }

    private static void findArea(int l) {
        System.out.println("Area is "+(l*l));
    }
}
