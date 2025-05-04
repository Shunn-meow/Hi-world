import java.util.Scanner;
public class j {

    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.print("ingrese el primer cateto:");
        double b=d.nextInt();
        System.out.print("ingrese el segundo cateto:");
        double a=d.nextInt();
        double c=(Math.sqrt((Math.pow(b, 2))+(Math.pow(a, 2))));
        System.out.print("la hipotenusa es:" +c);
        d.close();

    }
}