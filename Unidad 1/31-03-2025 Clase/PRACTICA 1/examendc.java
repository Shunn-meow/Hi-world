import java.util.Scanner;

public class examendc {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        double b=0;
        

        for(int i=1 ; i <=5;i ++){

        
        System.out.print("ingrese nota " +i+ ":");
        double c=a.nextInt();
        b=b+c;
        


        }
        double d=b/5;
System.out.printf("el promedio es: %.2f",d)
;
        
    }
}