import java.util.Scanner;

public class b {

    public static void main(String[] args) {
        
    
        Scanner viruz=new Scanner(System.in);

        System.out.print("ingrese numero natural:");
        int viruz1=viruz.nextInt();

        int viruz2=0;
        for( int i = 1; i<=viruz1; i++){
            viruz2=viruz2+i;

        }
        System.out.print("la suma de los primeros " + viruz1 + " numeros naturales es: " + viruz2);
        viruz.close();
    }
}