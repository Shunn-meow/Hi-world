import java.util.Scanner;

public class tabla {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("ingrese numero:");
    int b=a.nextInt();
    int c=1;
    for ( int i=2; i<=b; i++){
        c*=i;

        
    }
    System.out.println("el factorial de "+b+" es: "+ c);
    a.close();
    }}