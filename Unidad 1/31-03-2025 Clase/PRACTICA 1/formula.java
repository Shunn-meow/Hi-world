import java.util.Scanner ;
public class formula {

    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.print("ingrese el valor de a:");
        a =d.nextDouble();
        System.out.print("ingrese el valor de b:");
        b =d.nextDouble();
        System.out.print("ingrese el valor de c:");
        c =d.nextDouble();
        double discriminante=(Math.pow(b,  2)-(4*a*c));
        double raiz1=(-b+Math.sqrt(discriminante))/(2*a);
        double raiz2=(-b-Math.sqrt(discriminante))/(2*a);
        System.out.printf("las dos raices son: %.2f y %.2f",raiz1 ,raiz2)
;        d.close();


    }
}