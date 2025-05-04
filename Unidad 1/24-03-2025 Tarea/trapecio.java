import java.util.Scanner;

public class trapecio {

    public static void main(String[] args) {
        
        double B;
        double b;
        double h;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base mayor: " );
        B = scanner.nextInt();

        System.out.println("Ingrese la base menor: " );
        b = scanner.nextInt();

        System.out.println("Ingrese la altura: " );
        h = scanner.nextInt();

        double area = (B+b)*h/2;
        System.out.println("el resultado es: "+area);

        scanner.close();

    

         
    }
    
        
    }
