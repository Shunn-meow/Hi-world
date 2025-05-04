import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args){
        Double b;
        Double h;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base: ");
        b=scanner.nextDouble();

        System.out.println("Ingrese la altura; ");
        h=scanner.nextDouble();

        Double area=(b*h);

        System.out.println("el area es: " +area);

        scanner.close();
    }
}   