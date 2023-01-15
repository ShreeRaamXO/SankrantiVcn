import java.util.Scanner;
//4
public class Student_marks {
    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            String name = in.nextLine();
            int id = in.nextInt();
            int s1 = in.nextInt();
            int s2 = in.nextInt();
            int s3 = in.nextInt();
            int total = s1+s2+s3;
            float average = (s1+s2+s3)/3;
            display(name , id , average, total);
        }
    }

    private static void display(String name, int id, float average, int total) {
        System.out.println("Name - "+name);
        System.out.println("ID - "+id);
        System.out.println("Total marks - "+total);
        System.out.println("Percentege in 3 sub - "+average);
    }
}
