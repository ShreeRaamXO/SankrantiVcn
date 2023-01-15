import java.util.Scanner;
public class Job_Kashmir {
 public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
        System.out.println("Enter temp");
        int temp = in.nextInt();
        if(temp<0){
            System.out.println("Freezing Weather");
        }
        else if(temp < 10){
            System.out.println("very Cold weather");
        }
        else if(temp < 20){
            System.out.println("Cold Weather");
        }
        else if(temp < 30){
            System.out.println("normal Temp");
        }
        else if(temp < 40){
            System.out.println("hot ");
        }
        else{
            System.out.println("Very hot");
        }
    }
 }   
}