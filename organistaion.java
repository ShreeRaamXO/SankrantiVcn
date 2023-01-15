import java.util.Scanner;
//9
public class organistaion {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int department[] = new int[5];
            System.out.println("enter people in Each department");
            for(int i=0; i<5 ;i++){
                department[i] = in.nextInt();
            }
            // for removing 3 ppl 
            int ass_prof=0;
            for(int j=0 ; j<5 ;j++){
                ass_prof=ass_prof+(department[j]-3);
            }
            System.out.println("total number of Assistant prof are "+ass_prof);
        }
    }
}
