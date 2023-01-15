import java.util.Scanner;
//6
public class Armstrong {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the Value of N");
            int n = in.nextInt();
            isArmstrong(n);
            dispArmstrong(n);
        }
    }

    private static void isArmstrong(int n) {
        int i,nd=0,r;
        double x=0;
        
        for(i=n;i>0;i=i/10)
        {
          nd=nd+1;
        }
        for (i=n;i>0;i=i/10)
        {
            r=i%10;
            x=x+Math.pow(r,nd);
        }
        if(x==n)
        {
          System.out.println("***it is a amstrong number***");
        }
        else
        {
         System.out.println("***it is not amstong number***");
        }
        
    }
    private static void dispArmstrong(int n) {
        int i,j,nd=0,r,p=0;
        double x=0;
        for ( j=1;j<=n;j++){
            p=j;
            for(i=j;i>0;i=i/10){
                nd=nd+1;
             }
            for (i=j;i>0;i=i/10){
                r=i%10;
                x=x+Math.pow(r,nd);
            }   
            if(x==p)
            {
                System.out.println(x);
            }
        }
    }
}
