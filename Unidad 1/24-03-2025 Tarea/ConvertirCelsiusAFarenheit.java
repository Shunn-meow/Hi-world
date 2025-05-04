import java.util.Scanner;


public class ConvertirCelsiusAFarenheit {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double c;

        System.out.println("Ingrse los grados Celsius: ");
        c = scanner.nextDouble ();

        double resultado=(c*9)/5+32;
    
        System.out.println("La conversion de grados celsius a grados farenheit es:  "+resultado);
    
        scanner.close();
        
        
    }
}   