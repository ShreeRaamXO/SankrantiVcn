import java.util.Scanner;
//2 
public class cuboid {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter Dimensions ");
            double h = in.nextDouble();
            double b = in.nextDouble();
            double l = in.nextDouble();
            double vol = volume(h,b,l);
            System.out.println("Volume of the cuboid is "+vol);
        }
    }

    private static double volume(double h, double b, double l) {
        double v = h*b*l;
        return v;
    }

    public static void input() {
    }
}
