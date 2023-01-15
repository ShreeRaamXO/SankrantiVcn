import java.util.Scanner;
public class cuboidd {
    //5
    public int l;
    public int b;
    public int h;
    public int vol(){
        return l*b*h;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            cuboidd cuboid1 = new cuboidd();
            cuboidd cuboid2 = new cuboidd();
            System.out.println("enter dimensionns for cuboid 1");
            cuboid1.l=in.nextInt();
            cuboid1.b=in.nextInt();
            cuboid1.h=in.nextInt();
            System.out.println("Volume of cuboid 1 = "+(cuboid1.vol()));
            System.out.println("enter dimentions for cuboid 2");
            cuboid2.l=in.nextInt();
            cuboid2.b=in.nextInt();
            cuboid2.h=in.nextInt();
            System.out.println("Volume of cuboid 2 + "+(cuboid2.vol()));
        }
        
    }

}
