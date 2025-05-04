import java.util.Scanner;

public class a {

    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        System.out.print("ingrese numero natural:");
        int c=b.nextInt();
        int d=0;
        for( int i=1; i<=c ;i++){
        d=d+i;
        }
  System.out.print("la suma de los primeros " + c + " numeros naturales es: " + d);
  b.close();
    }
}