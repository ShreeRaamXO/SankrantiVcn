
public class Student_Details{
    static String name;
    static long id;
    static String gender;
    static String dept;
    static String phoneNo;
    static int sub1;
    static int sub2;
    static int sub3;
    static int totalMarks;
    static double percentage;
    public static void main(String[] args) {
        name = "Sriram";
        id = 210030024;
        gender = "male";
        dept = "CSE";
        phoneNo = "701-327-3598";
        sub1=99;
        sub2=98;
        sub3=100;
        display();
    }
    private static void display() {
        System.out.println("name "+name+", gender "+gender);
        System.out.println("id -"+id%100000+" ,phone num "+phoneNo);
        System.out.println("avg = "+(sub1+sub2+sub3)/3+"%");

    }

}